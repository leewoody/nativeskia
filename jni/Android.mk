LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

MY_ANDROID_SOURCE=$(HOME)/android/source/eclair

LOCAL_MODULE := libnativeskia
LOCAL_CPP_EXTENSION := .cpp
LOCAL_CXXFLAGS :=

LOCAL_C_INCLUDES := $(MY_ANDROID_SOURCE)/frameworks/base/core/jni/android/graphics \
					$(MY_ANDROID_SOURCE)/external/skia/include/core \
					$(MY_ANDROID_SOURCE)/external/skia/include/images \
					$(MY_ANDROID_SOURCE)/frameworks/base/include \
					$(MY_ANDROID_SOURCE)/system/core/include 

LOCAL_SRC_FILES := SkiaDemoJni.cpp

LOCAL_LDLIBS := -llog -lskia -landroid_runtime \
				-L$(MY_ANDROID_SOURCE)/out/target/product/generic/system/lib/

include $(BUILD_SHARED_LIBRARY)
