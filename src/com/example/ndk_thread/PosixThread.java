package com.example.ndk_thread;

public class PosixThread {

	public native void pthread();
	public native void init();
	public native void destroy();
	
	static{
		System.loadLibrary("NDK_thread");
	}
}
