����   : �  
pack1/Test  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lpack1/Test; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   请输入你的姓名
 " $ # java/io/PrintStream % & println (Ljava/lang/String;)V
  ( ) * nextLine ()Ljava/lang/String; , 请输入你的性别 . 请输入你的年龄
  0 1 2 nextInt ()I 4 您输入的信息是：
 " 6 % 7 (I)V 9 	pack1/Txt
 8 	
  < =  txt ? 请检查输入是否有误
  A B  close D java/lang/Exception args [Ljava/lang/String; scanner Ljava/util/Scanner; Name Ljava/lang/String; Sex Age I Lpack1/Txt; o Ljava/lang/Exception; StackMapTable F T java/io/FileReader V &D:\JAVA\Studentwork\bin\pack1\poem.txt
 S X  & Z java/io/FileWriter \ %D:\JAVA\Studentwork\bin\pack1\chg.txt
 Y X _ java/lang/StringBuffer
 ^ 	
 ^ b c d append ([CII)Ljava/lang/StringBuffer; f ,
 ^ h c i ,(Ljava/lang/String;)Ljava/lang/StringBuffer; k 。

 S m n o read ([C)I
 " q % r (Ljava/lang/Object;)V t java/lang/String
 s v  w (Ljava/lang/StringBuffer;)V
 Y y z & write
 Y A
 S A
 ~ �  java/lang/Throwable � � addSuppressed (Ljava/lang/Throwable;)V
 � � � java/io/IOException �  printStackTrace FileInputStream Ljava/io/FileReader; FileOutputStream Ljava/io/FileWriter; gs Ljava/lang/StringBuffer; chg [C e Ljava/io/IOException; � 
SourceFile 	Test.java !               /     *� �    
                    	      5     n� Y� � L� � !+� 'M� +� !+� 'N� -� !+� /6� 3� !� ,� !� -� !� � 5� 8Y� ::� ;� M� >� !+� @�   ] ` C  
   F        	  
    %  -  3  ;  B  I  Q  Z  ]  a  i  m     H    n E F    c G H   E I J  % 8 K J  3 * L M  Z  = N  a  O P  Q    � `  R   C 	 =     �     �KL� SYU� WM� YY[� ]N� ^Y� `:�:� *� aWe� gW� aWj� gW,� l��Ҳ � p-� sY� u� x-� -� {� K-� -� {*�,� C,� |� <L*� +K� *+� *+� },� ,� |*�L*� +K� *+� *+� }*�K*� ��   p {    � �    � �     � � �  
   >         !  '  *   5 ! = " I # Q  [ & c ' p ( � ) � +    4   � � �   l � �  ! O � �  ' I � �  �  � �   Q   P � *  ~ ~ S Y ^ �  &� )  ~ ~ S Y  ~� J ~		� A ~		�     �  �    �