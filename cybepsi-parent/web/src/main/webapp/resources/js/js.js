window.onload = function() {
  windowHeight = window.innerHeight;
  $('body').height(window.innerHeight);
};

$(document).ready(function(){
  $(".contenu-un-panier").click(function() {
    $('.contenu-panier').css('display', 'none');
    $('#myModal').modal('show');
  })
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
  $("body").css("display", "none");
    $("body").fadeIn(2000);
  $("a.transition").click(function(event){
    event.preventDefault();
    linkLocation = this.href;
    $("body").fadeOut(1000, redirectPage);
  });

  function redirectPage() {
    window.location = linkLocation;
  }
});
