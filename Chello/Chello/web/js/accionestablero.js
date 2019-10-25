/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function actualizarDescripcion(campoDescripcion, idActividad, titulo, vencimiento, estado) {

    var descripcion = $("#".concat(campoDescripcion)).val();

    $.ajax({
        type: "GET",
        dataType: "json",
        url: "../jsp/editardescripcionactividad.jsp" + "?idActividad=" + idActividad + "&descripcion=" +
                descripcion + "&titulo=" + titulo + "&vencimiento=" + vencimiento + "&estado=" + estado,

        success: function () {

        },
        error: function (err) {
            console.log(err);
        }

    });
}

function actualizarTituloActividad(campoTitulo, id, descripcion, vencimiento, estado) {

    var titulo = $("#".concat(campoTitulo)).val();


    $.ajax({
        type: "GET",
        dataType: "json",
        url: "../jsp/editartituloactividad.jsp?titulo=" + titulo + "&idActividad=" + id
                + "&descripcion=" + descripcion + "&vencimiento=" + vencimiento + "&estado=" + estado,

        success: function () {
            $("#tarjeta".concat(id)).html(titulo);
        },
        error: function (err) {
            $("#tarjeta".concat(id)).html(titulo);
        }

    });

}

function rellenarEmail(elemento) {

    var email = $(elemento).data('value');

    $("#email-agregar-tablero").val(email);

    $("#lista").html("");
}

function detectarEmail() {

    var email = $("#email-agregar-tablero").val();

    $.ajax({

        type: "GET",
        dataType: "html",
        url: "../jsp/comprobaremail.jsp?email=" + email,

        success: function (respuesta) {
            $("#lista").html(respuesta);
        },
        error: function (err) {
            $("#lista").html(err);
            console.log(err);
        }

    });

}

function crearActividad(id) {

    var modulo = id;
    var titulo = $("#titulocrearactividad".concat(id)).val();
    var descripcion = $("#descripcioncrearactividad".concat(id)).val();
    var vencimiento = $("#vencimientocrearactividad".concat(id)).val();


    $.ajax({

        type: "GET",
        dataType: "json",
        url: "../jsp/crearactividad.jsp" + "?modulo=" + modulo + "&titulo=" + titulo +
                "&descripcion=" + descripcion + "&vencimiento=" + vencimiento,

        success: function () {
            
            location.reload();
        },
        error: function (err) {
            $("#listaActividades".concat(modulo)).load(" #listaActividades".concat(modulo));
            console.log(err);
            
            location.reload();
        }

    });

}

function eliminarActividad(id, modulo){
    
     $.ajax({

        type: "GET",
        dataType: "json",
        url: "../jsp/eliminaractividad.jsp?id="+id,

        success: function () {

          location.reload(); 

        },
        error: function (err) {

          location.reload(); 
        }

    });
}

function comentar(id){

    var comentario = $("#comentario".concat(id)).val();
    
    $.ajax({

        type: "GET",
        dataType: "json",
        url: "../jsp/comentar.jsp?id="+id+"&comentario="+comentario,

        success: function () {
    
            location.reload(); 
        },
        error: function () {
            
            location.reload(); 
        }

    });
    
}


function moverActividad(idActividad,titulo,descripcion,vencimiento,estado,modulo){
    
    var moduloSeleccionado = $("#moduloseleccionado".concat(modulo)).val();
    
    console.log(modulo);
    console.log(moduloSeleccionado);
    
    $.ajax({

        type: "GET",
        dataType: "json",
        url: "../jsp/moveractividad.jsp"+"?idActividad=" + idActividad + "&titulo=" + titulo +
                "&descripcion=" + descripcion + "&vencimiento=" + vencimiento+ "&estado=" + estado+ 
                "&modulo=" + moduloSeleccionado,

        success: function () {
    
            location.reload(); 
        },
        error: function () {
            
            location.reload(); 
        }

    });
}
