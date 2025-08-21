package com.bugsnag.android;

import android.util.JsonReader;
import com.bugsnag.android.S;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0001\u001bB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001dR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010!¨\u0006#"}, d2 = {"Lcom/bugsnag/android/T;", "Lcom/bugsnag/android/U;", "Ljava/io/File;", "file", "Lkotlin/Function0;", "Ljava/util/UUID;", "deviceIdGenerator", "Lcom/bugsnag/android/D0;", "logger", "<init>", "(Ljava/io/File;Lkotlin/jvm/functions/Function0;Lcom/bugsnag/android/D0;)V", "Lcom/bugsnag/android/S;", "b", "()Lcom/bugsnag/android/S;", "uuid", "", "d", "(Ljava/util/UUID;)Ljava/lang/String;", "Ljava/nio/channels/FileChannel;", "channel", "c", "(Ljava/nio/channels/FileChannel;Ljava/util/UUID;)Ljava/lang/String;", "Ljava/nio/channels/FileLock;", "e", "(Ljava/nio/channels/FileChannel;)Ljava/nio/channels/FileLock;", "", "requestCreateIfDoesNotExist", "a", "(Z)Ljava/lang/String;", "Ljava/io/File;", "Lkotlin/jvm/functions/Function0;", "Lcom/bugsnag/android/D0;", "Lcom/bugsnag/android/h1;", "Lcom/bugsnag/android/h1;", "synchronizedStreamableStore", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class T implements U {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final File file;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function0<UUID> deviceIdGenerator;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final D0 logger;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final h1<S> synchronizedStreamableStore;

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* synthetic */ class b extends FunctionReferenceImpl implements Function1<JsonReader, S> {
        b(Object obj) {
            super(1, obj, S.Companion.class, "fromReader", "fromReader(Landroid/util/JsonReader;)Lcom/bugsnag/android/DeviceId;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S invoke(JsonReader jsonReader) {
            return ((S.Companion) this.receiver).a(jsonReader);
        }
    }

    private final String d(UUID uuid) {
        try {
            FileChannel channel = new FileOutputStream(this.file).getChannel();
            try {
                String strC = c(channel, uuid);
                CloseableKt.a(channel, null);
                return strC;
            } finally {
            }
        } catch (IOException e10) {
            this.logger.b("Failed to persist device ID", e10);
            return null;
        }
    }

    private final FileLock e(FileChannel channel) throws InterruptedException {
        int i10 = 0;
        while (i10 < 20) {
            i10++;
            try {
                return channel.tryLock();
            } catch (OverlappingFileLockException unused) {
                Thread.sleep(25L);
            }
        }
        return null;
    }

    @Override // com.bugsnag.android.U
    public String a(boolean requestCreateIfDoesNotExist) {
        try {
            S sB = b();
            if ((sB == null ? null : sB.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String()) != null) {
                return sB.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String();
            }
            if (requestCreateIfDoesNotExist) {
                return d(this.deviceIdGenerator.invoke());
            }
            return null;
        } catch (Throwable th2) {
            this.logger.b("Failed to load device ID", th2);
            return null;
        }
    }

    private final S b() {
        if (this.file.length() <= 0) {
            return null;
        }
        try {
            return (S) this.synchronizedStreamableStore.b(new b(S.INSTANCE));
        } catch (Throwable th2) {
            this.logger.b("Failed to load device ID", th2);
            return null;
        }
    }

    public T(File file, Function0<UUID> function0, D0 d02) {
        this.file = file;
        this.deviceIdGenerator = function0;
        this.logger = d02;
        try {
            file.createNewFile();
        } catch (Throwable th2) {
            this.logger.b("Failed to created device ID file", th2);
        }
        this.synchronizedStreamableStore = new h1<>(this.file);
    }

    private final String c(FileChannel channel, UUID uuid) throws InterruptedException, IOException {
        String str;
        FileLock fileLockE = e(channel);
        String str2 = null;
        if (fileLockE == null) {
            return null;
        }
        try {
            S sB = b();
            if (sB != null) {
                str2 = sB.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String();
            }
            if (str2 != null) {
                str = sB.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String();
            } else {
                S s10 = new S(uuid.toString());
                this.synchronizedStreamableStore.c(s10);
                str = s10.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String();
            }
            fileLockE.release();
            return str;
        } catch (Throwable th2) {
            fileLockE.release();
            throw th2;
        }
    }
}
