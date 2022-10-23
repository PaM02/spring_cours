# spring_cours
C’est grâce à l’IoC container de Spring ! Rappelez-vous, je vous ai appris dans la première partie le concept de l’injection de dépendances. En mettant l’annotation @Autowired sur l’attribut bs, Spring va chercher au sein de son contexte s’il existe un bean de type BusinessService. 

✅ S’il le trouve, il va alors instancier la classe de ce bean et injecter cette instance dans l’attribut. 

❌ S’il ne trouve pas de bean de ce type, Spring génère une erreur.

Résultat : nul besoin de gérer l’instanciation du BusinessService, Spring s’en occupe pour nous. :-)