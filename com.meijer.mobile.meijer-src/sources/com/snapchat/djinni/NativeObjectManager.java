package com.snapchat.djinni;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public class NativeObjectManager {
    private final ReferenceQueue<Object> mReferenceQueue;
    private final ConcurrentHashMap<NativeObjectWrapper, Boolean> mReferences;
    private final Thread mThread;

    public static class NativeObjectWrapper extends PhantomReference<Object> {
        private final Method mDestroyMethod;
        private final long mNativeRef;

        void cleanup() throws Exception {
            this.mDestroyMethod.invoke(null, Long.valueOf(this.mNativeRef));
        }

        String getClassName() {
            return this.mDestroyMethod.getDeclaringClass().getName();
        }

        NativeObjectWrapper(Object obj, Class<?> cls, long j10, ReferenceQueue<? super Object> referenceQueue) throws NoSuchMethodException {
            super(obj, referenceQueue);
            this.mNativeRef = j10;
            this.mDestroyMethod = cls.getMethod("nativeDestroy", Long.TYPE);
        }
    }

    private native void noMinify();

    public static void register(Object obj, long j10) {
        register(obj, obj.getClass(), j10);
    }

    public static class Holder {
        static final NativeObjectManager instance = new NativeObjectManager();

        private Holder() {
        }
    }

    private NativeObjectManager() {
        this.mReferenceQueue = new ReferenceQueue<>();
        this.mReferences = new ConcurrentHashMap<>();
        Thread thread = new Thread("NativeObjectManager") { // from class: com.snapchat.djinni.NativeObjectManager.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() throws InterruptedException {
                while (true) {
                    try {
                        Reference referenceRemove = NativeObjectManager.this.mReferenceQueue.remove();
                        if (referenceRemove == null) {
                            return;
                        }
                        NativeObjectWrapper nativeObjectWrapper = (NativeObjectWrapper) referenceRemove;
                        if (((Boolean) NativeObjectManager.this.mReferences.remove(nativeObjectWrapper)).booleanValue()) {
                            try {
                                nativeObjectWrapper.cleanup();
                            } catch (Exception e10) {
                                System.out.println("Exception in native cleanup: " + e10.getCause());
                            }
                        }
                    } catch (InterruptedException unused) {
                        return;
                    }
                }
            }
        };
        this.mThread = thread;
        thread.setPriority(4);
        thread.start();
    }

    public static void register(Object obj, Class<?> cls, long j10) {
        Object obj2;
        try {
            NativeObjectManager nativeObjectManager = Holder.instance;
            obj2 = obj;
            try {
                nativeObjectManager.mReferences.put(new NativeObjectWrapper(obj2, cls, j10, nativeObjectManager.mReferenceQueue), Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                throw new RuntimeException("failed to register object of type " + obj2.getClass().getName() + " no static method nativeDestroy() found");
            }
        } catch (NoSuchMethodException unused2) {
            obj2 = obj;
        }
    }

    public static void stop() {
        Holder.instance.mThread.interrupt();
    }
}
