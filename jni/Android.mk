LOCAL_PATH := $(call my-dir) #内置函数

include $(CLEAR_VARS)

LOCAL_MODULE    := NDK_thread
LOCAL_SRC_FILES := NDK_thread.c
LOCAL_LDLIBS := -llog
include $(BUILD_SHARED_LIBRARY)
