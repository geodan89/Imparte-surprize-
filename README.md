# Imparte-surprize-
Java Class Hierarchy - Aplicatie 'Imparte surprize'
Aprofundarea conceptelor de design a ierarhiei de clase: reutilizare cod: mostenire, compunere si agregare; incapsulare, delegare, design si proiectarea unei arhitecturi de clase;organizarea corecta a codului; upcasting; interfete si comunicare intre componente; genericitate;
Scop final: obtinerea unui sistem generic capabil sa utilizeze mai multe tipuri de surprize; implementare algoritmi de stocare si daruire surprize; utilizarea unui mecanism aleator de generare a unui set de surprize;
3 Tipuri de suprize: Candies; FortuneCookie; MinionToy;
3 Tipuri de containere pentru depozitarea surprizelor: RandomBag(va da cadourile in ordine aleatoare); LifoBag(va da cadourile in ordinea inversa introducerii); FifoBag(va da cadourile in ordinea in care acestea au fost introduse); Pentru implementare containere am folosit colectia ArrayList;
GatherSurprises - prin aceasta clasa se colecteaza surprizele pregatite de oameni darnici pentru cei mici (i.e. in preajma sarbatorilor).
BagFactory clasa ce implementeaza Factory design pattern;
Clasa abstracta AbstractGiveSurprises - mecanism de a imparti surprizele; are 2 campuri: un container - poate accepta orice tip concret de obiect-componenta, compatibil cu interfata IBag(RandomBag, LifoBag, FifoBag); si waitTime - timp de asteptare intre distribuirea surprizelor;
3 moduri de impartire a suprizelor - 3 clase ce extind clasa abstracta AbstractGiveSurprises: GiveSurpriseAndApplause; GiveSurpriseAndSing; GiveSurpriseAndHug;
