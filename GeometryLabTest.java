public class GeometryLabTest { 
    public static void main (String [] args) {
        GeometryLab p = new GeometryLab();
        System.out.println(p.f(2,3));
        System.out.println(p.f(4,8));
        System.out.println(p.g(3,5));
        System.out.println(p.g(5,3));
        System.out.println(p.h(2,9));
        System.out.println(p.h(4,10));
        System.out.println(p.j(5,10));
        System.out.println(p.j(10,5));
        System.out.println(p.k(9,7));
        System.out.println(p.k(7,9));
        System.out.println(p.m(3,4,5));
        System.out.println(p.m(4,6,3));
        System.out.println(p.f(p.g(3,5),p.k(7,9)));
        System.out.println(p.f(p.j(10,5),p.h(2,9)));
        System.out.println(p.g(p.m(3,4,5),p.h(4,10)));
        System.out.println(p.g(p.j(5,10),p.f(2,3)));
        System.out.println(p.h(p.m(4,6,3),p.f(4,8)));
        System.out.println(p.h(p.k(9,7),p.g(5,3)));
        System.out.println(p.j(p.k(7,9),p.g(3,5)));
        System.out.println(p.j(p.h(2,9),p.m(4,6,3)));
        System.out.println(p.k(p.m(3,4,5),p.j(10,5)));
        System.out.println(p.k(p.k(9,7),p.f(4,8)));
        System.out.println(p.m(p.h(4,10),p.f(2,3),p.g(5,3)));
        System.out.println(p.m(p.k(7,9),p.j(5,10),p.h(4,10)));
        System.out.println(p.triArea(2, 3));
        System.out.println(p.triArea(4,8));
        System.out.println(p.trapArea(3, 4, 5));
        System.out.println(p.trapArea(4, 6, 3));
        System.out.println(p.rectArea(3, 5));
        System.out.println(p.rectArea(5, 3));
        System.out.println(p.circArea(7));
        System.out.println(p.circArea(9));
        System.out.println(p.paralArea(2, 9));
        System.out.println(p.paralArea(4, 10));
        System.out.println(p.pythHypotenuse(5, 10));
        System.out.println(p.pythHypotenuse(9, 7));
        System.out.println(p.triPrismVol(10, 5, 4));
        System.out.println(p.triPrismVol(7, 9, 3));
        System.out.println(p.rectPrismVol(2, 3, 4));	
        System.out.println(p.rectPrismVol(8, 3, 6));
        System.out.println(p.rectPyramidVol(5, 7, 9));
        System.out.println(p.rectPyramidVol(4, 6, 8));
        System.out.println(p.cylVol(9, 2));	
        System.out.println(p.cylVol(10, 3));
        System.out.println(p.sphereVol(6));  	
        System.out.println(p.sphereVol(8)); 
        System.out.println(p.coneVol(6, 5)); 
        System.out.println(p.coneVol(8, 7)); 
        System.out.println(p.sphereSurfArea(7));
        System.out.println(p.cylSurfArea(4, 7)); 	
        System.out.println(p.cylSurfArea(5, 3));
        System.out.println(p.rectPrismSurfArea(2, 3, 4));   	
        System.out.println(p.rectPrismSurfArea(8, 3, 6));
        System.out.println(p.triArea(p.f(2, 3),p.h(4, 8)));     	
        System.out.println(p.rectArea(p.g(7, 5),p. j(5, 3)));
        System.out.println(p.trapArea(p.m(3, 4, 5),p. m(4, 6, 3),p. m(8, 3, 6)));
        System.out.println(p.circArea(p.k(8, 5)));        	
        System.out.println(p.paralArea(p.j(9, 2),p. f(4, 10)));
        System.out.println(p.pythHypotenuse(p.f(5, 10),p. g(9, 7)));
        System.out.println(p.triPrismVol(p.m(10, 5, 4),p. m(7, 9, 3),p. m(5, 7, 3)));
        System.out.println(p.rectPrismVol(p.h(2, 4),p. m(8, 3, 6),p. h(3, 6)));
        System.out.println(p.rectPyramidVol(p.m(5, 7, 9),p. m(4, 6, 8),p. k(20, 7)));
        System.out.println(p.cylVol(p.h(9, 2),p. k(10, 3)));
        System.out.println(p.sphereVol(p.g(9, 6)));
        System.out.println(p.coneVol(p.j(6, 5),p. j(8, 7)));	
        System.out.println(p.sphereSurfArea(p.m(4, 3, 1)));
        System.out.println(p.cylSurfArea(4,p.f(5, 3)));
        System.out.println(p.rectPrismSurfArea(p.pythHypotenuse(3, 4), 3,p. k(13, 5)));
    }
}



        