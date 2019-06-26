(function(){

    let selectGeneroo = document.getElementById('selectGenero');
    let selectArtista = document.getElementById('selectArtista');

    let url_string = window.location.href;
    let url = new URL(url_string);
    let genero = url.searchParams.get("genero");
    let artista = url.searchParams.get("artista");

    if(genero != null) selectGeneroo.value = genero;
    if(artista != null) selectArtista.value = artista;


    selectGeneroo.addEventListener('change', function(evt) {
        window.location.replace('/?genero=' + this.value + '&artista=' + selectArtista.value);
    });

    selectArtista.addEventListener('change', function(evt) {
        window.location.replace('/?artista=' + this.value + '&genero=' + selectGeneroo.value);
    });
})();