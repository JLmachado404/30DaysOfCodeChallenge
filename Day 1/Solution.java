����   D f
      java/lang/Object <init> ()V  java/util/Scanner	 
     java/lang/System in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V
     nextLine ()Ljava/lang/String;
      java/lang/Integer parseInt (Ljava/lang/String;)I
      ! java/lang/Double parseDouble (Ljava/lang/String;)D
 # $ % & ' java/lang/Math ceil (D)D
  ) *  close	 
 , - . out Ljava/io/PrintStream;
 0 1 2 3 4 java/io/PrintStream println (I)V
 0 6 3 7 (D)V   9 : ; makeConcatWithConstants &(Ljava/lang/String;)Ljava/lang/String;
 0 = 3 > (Ljava/lang/String;)V @ Solution Code LineNumberTable LocalVariableTable this 
LSolution; main ([Ljava/lang/String;)V args [Ljava/lang/String; scn Ljava/util/Scanner; i I d D s Ljava/lang/String; intd sum 	doubleSum 
SourceFile Solution.java BootstrapMethods Y HackerRank  [
 \ ] ^ : _ $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; InnerClasses b %java/lang/invoke/MethodHandles$Lookup d java/lang/invoke/MethodHandles Lookup ! ?           A   /     *� �    B        C        D E   	 F G  A   �  
   ]� Y� 	� L+� � =+� � J+� :)� "�6`6))c9+� (� +� /� +� /� +� 5� +� 8  � <�    B   6        	  
 !  (  .  3  7  ?  G  O  \  C   R    ] H I    R J K   J L M   B N O  ! < P Q  ( 5 R M  . / S M  3 * T O   U    V W     Z  X `   
  a c e 