#ifndef __SKIADEMOJNI_H__
#define __SKIADEMOJNI_H__

#include <jni.h>

#ifdef __cplusplus
extern "C" {
#endif

void Java_net_mogoweb_nativeskia_SkiaView_renderHello(JNIEnv *env, jobject thizz, jobject canvas);
void Java_net_mogoweb_nativeskia_SkiaView_renderText(JNIEnv *env, jobject thizz, jobject canvas);
void Java_net_mogoweb_nativeskia_SkiaView_renderImage(JNIEnv *env, jobject thizz, jobject canvas);

#ifdef __cplusplus
}
#endif

#endif
