echo off
c:
cd site
del index.html
cd imagens
del *.png
cd ..
cd paginas
del *.html
cd ..
rd imagens
rd paginas
cd ..
rd site
