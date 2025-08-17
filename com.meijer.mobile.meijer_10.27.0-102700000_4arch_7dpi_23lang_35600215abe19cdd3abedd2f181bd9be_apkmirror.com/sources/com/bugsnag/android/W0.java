package com.bugsnag.android;

import android.util.JsonReader;
import com.bugsnag.android.C6482m0;
import com.bugsnag.android.C6482m0.a;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00028\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/bugsnag/android/W0;", "Lcom/bugsnag/android/m0$a;", "T", "", "Ljava/io/File;", "file", "<init>", "(Ljava/io/File;)V", "streamable", "", "b", "(Lcom/bugsnag/android/m0$a;)V", "Lkotlin/Function1;", "Landroid/util/JsonReader;", "loadCallback", "a", "(Lkotlin/jvm/functions/Function1;)Lcom/bugsnag/android/m0$a;", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "lock", "Ljava/io/File;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class W0<T extends C6482m0.a> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final File file;

    public final T a(Function1<? super JsonReader, ? extends T> loadCallback) throws IOException {
        ReentrantReadWriteLock.ReadLock lock = this.lock.readLock();
        Intrinsics.f(lock, "lock.readLock()");
        lock.lock();
        try {
            File file = this.file;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), Charsets.UTF_8), 8192);
            try {
                T tInvoke = loadCallback.invoke(new JsonReader(bufferedReader));
                CloseableKt.a(bufferedReader, null);
                return tInvoke;
            } finally {
            }
        } finally {
            lock.unlock();
        }
    }

    public final void b(T streamable) throws IOException {
        ReentrantReadWriteLock.WriteLock writeLock = this.lock.writeLock();
        Intrinsics.f(writeLock, "lock.writeLock()");
        writeLock.lock();
        try {
            File file = this.file;
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), Charsets.UTF_8), 8192);
            try {
                streamable.toStream(new C6482m0(bufferedWriter));
                CloseableKt.a(bufferedWriter, null);
            } finally {
            }
        } finally {
            writeLock.unlock();
        }
    }

    public W0(File file) {
        this.file = file;
    }
}
