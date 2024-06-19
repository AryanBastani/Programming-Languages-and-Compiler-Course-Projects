.class public Main
		.super java/lang/Object
.method public static main([Ljava/lang/String;)V
		.limit stack 128
		.limit locals 128
		new Main
		invokespecial Main/<init>()V
		return
		.end method
.method public static salam(Ljava/lang/String;IZ)V
		.limit stack 128
		.limit locals 128
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 0
		invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
		return
		.end method
.method public <init>()V
		.limit stack 128
		.limit locals 128
		aload_0
		invokespecial java/lang/Object/<init>()V
		ldc "1,2,3"
		
		ldc 1
		
		ldc 1
		
		invokestatic Main/salam(Ljava/lang/String;IZ)V
		return
		.end method
