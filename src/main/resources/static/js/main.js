$(document).ready(function () {
   $('.table .editButton').on('click', function(event){
       event.preventDefault();

       var href = $(this).attr('href');
       $.get(href, function(note, status){
           $('#idEdit').val(note.id);
           $('#titleEdit').val(note.title);
           $('#descriptionEdit').val(note.description);
           $('#categoryEdit').val(note.category);
           $('#dataEdit').val(note.data.substr(0,10));
       })

       $('#editModal').modal();
   });

   $('.table .deleteButton').on('click', function(event) {
       event.preventDefault();
       var href = $(this).attr('href');
       $('#deleteModal #deleteId').attr('href', href);
       $('#deleteModal').modal();
    });

    $('.table .openButton').on('click', function(event){
        event.preventDefault();

        var href = $(this).attr('href');
        $.get(href, function(note, status){
            $('#titleOpen').val(note.title);
            $('#descriptionOpen').val(note.description);
            $('#categoryOpen').val(note.category);
            $('#dataOpen').val(note.data.substr(0,10));
        })

        $('#openModal').modal();
    });

});