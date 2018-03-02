/**Mascara de formatação
 * 
 */

$(function() {
			$("#telefoneOs").mask("(99)9999-9999");
			$("#cnpjOs").mask("99.999.999/9999-99");
			$("#telefoneVoluntario").mask("(99)99999-9999");
			$("#cpfVoluntario").mask("999.999.999-99");
		});
		function abrir() {
			var main = document.getElementById("central");
			var iten = main.getElementsByTagName("input");
			if (iten) {
				for (var i = 0; i < iten.length; i++) {
					iten[i].onclick = function() {
						var el = document.getElementById(this.id.substr(7, 7));
						if (el.style.display == "block")
							el.style.display = "none";
						else
							el.style.display = "block";
					}
				}
			}
		}
		window.onload = abrir;