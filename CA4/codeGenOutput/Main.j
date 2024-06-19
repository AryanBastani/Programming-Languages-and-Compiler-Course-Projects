.class public Main
		.super java/lang/Object
.method public static main([Ljava/lang/String;)V
		.limit stack 128
		.limit locals 128
		new Main
		invokespecial Main/<init>()V
		return
		.end method
.method public <init>()V
		.limit stack 128
		.limit locals 128
		aload_0
		invokespecial java/lang/Object/<init>()V
		ldc 50
		
		istore 1
		ldc 61
		
		istore 2
		iload 2
		
		iload 1
		
		isub
		
		istore 3
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc "Hello World!\n"
		invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc "cur value c : "
		invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
		getstatic java/lang/System/out Ljava/io/PrintStream;
		iload 3
		invokevirtual java/io/PrintStream/println(I)V
		ldc 1
		
		iload 3
		isub
		ineg
		istore 3
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc "MINUS 1 :"
		invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
		getstatic java/lang/System/out Ljava/io/PrintStream;
		iload 3
		invokevirtual java/io/PrintStream/println(I)V
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc "DIVIDE by 2 :"
		invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
		ldc 2
		
		iload 3
		ldc 2
		
		idiv
		istore 3
		getstatic java/lang/System/out Ljava/io/PrintStream;
		iload 3
		invokevirtual java/io/PrintStream/println(I)V
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc "MULTIPLY by 3 :"
		invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
		ldc 3
		
		iload 3
		imul
		istore 3
		getstatic java/lang/System/out Ljava/io/PrintStream;
		iload 3
		invokevirtual java/io/PrintStream/println(I)V
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc "MOD 4 :"
		invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
		ldc 4
		
		iload 3
		irem
		istore 3
		getstatic java/lang/System/out Ljava/io/PrintStream;
		iload 3
		invokevirtual java/io/PrintStream/println(I)V
		return
		.end method
