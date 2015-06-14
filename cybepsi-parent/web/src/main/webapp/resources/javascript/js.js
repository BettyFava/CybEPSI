window.onload = function() {
  windowHeight = window.innerHeight;
  $('body').height(window.innerHeight);
};

$(document).ready(function(){
  $(".img-responsive").click(function() {
    $('.contenu-panier').css('display', 'none');
    $('#myModal').modal('show');
  })
  $('.btn-panier').click(function() {
    if($('.contenu-panier').css('display') == 'none') {
      $('.contenu-panier').css('display', 'block');
    } else {
      $('.contenu-panier').css('display', 'none');
    }
  })
  $('.btn-add-modal').click(function() {
    $('#myModal').modal('hide');
    if($('.contenu-panier').css('display') == 'none') {
      $('.contenu-panier').css('display', 'block');
    } else {
      $('.contenu-panier').css('display', 'none');
    }
  })
});
