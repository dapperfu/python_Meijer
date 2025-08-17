package com.bugsnag.android;

import android.util.JsonReader;
import com.bugsnag.android.L;
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
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\u00020\u0001:\u0001\u001bB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010 R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\"¨\u0006#"}, d2 = {"Lcom/bugsnag/android/M;", "Lcom/bugsnag/android/N;", "Ljava/io/File;", "file", "Lkotlin/Function0;", "Ljava/util/UUID;", "deviceIdGenerator", "Lcom/bugsnag/android/t0;", "logger", "<init>", "(Ljava/io/File;Lkotlin/jvm/functions/Function0;Lcom/bugsnag/android/t0;)V", "Lcom/bugsnag/android/L;", "b", "()Lcom/bugsnag/android/L;", "uuid", "", "d", "(Ljava/util/UUID;)Ljava/lang/String;", "Ljava/nio/channels/FileChannel;", "channel", "c", "(Ljava/nio/channels/FileChannel;Ljava/util/UUID;)Ljava/lang/String;", "Ljava/nio/channels/FileLock;", "e", "(Ljava/nio/channels/FileChannel;)Ljava/nio/channels/FileLock;", "", "requestCreateIfDoesNotExist", "a", "(Z)Ljava/lang/String;", "Lcom/bugsnag/android/W0;", "Lcom/bugsnag/android/W0;", "synchronizedStreamableStore", "Ljava/io/File;", "Lkotlin/jvm/functions/Function0;", "Lcom/bugsnag/android/t0;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class M implements N {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final W0<L> synchronizedStreamableStore;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final File file;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Function0<UUID> deviceIdGenerator;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6495t0 logger;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/util/JsonReader;", "p1", "Lcom/bugsnag/android/L;", "a", "(Landroid/util/JsonReader;)Lcom/bugsnag/android/L;"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class b extends FunctionReference implements Function1<JsonReader, L> {
        b(L.Companion companion) {
            super(1, companion);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "fromReader";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.b(L.Companion.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "fromReader(Landroid/util/JsonReader;)Lcom/bugsnag/android/DeviceId;";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final L invoke(JsonReader jsonReader) {
            return ((L.Companion) this.receiver).a(jsonReader);
        }
    }

    private final String d(UUID uuid) {
        try {
            FileChannel channel = new FileOutputStream(this.file).getChannel();
            try {
                Intrinsics.f(channel, "channel");
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
        for (int i10 = 0; i10 < 20; i10++) {
            try {
                return channel.tryLock();
            } catch (OverlappingFileLockException unused) {
                Thread.sleep(25L);
            }
        }
        return null;
    }

    @Override // com.bugsnag.android.N
    public String a(boolean requestCreateIfDoesNotExist) {
        try {
            L lB = b();
            if ((lB != null ? lB.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String() : null) != null) {
                return lB.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String();
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

    private final L b() {
        if (this.file.length() <= 0) {
            return null;
        }
        try {
            return (L) this.synchronizedStreamableStore.a(new b(L.INSTANCE));
        } catch (Throwable th2) {
            this.logger.b("Failed to load device ID", th2);
            return null;
        }
    }

    public M(File file, Function0<UUID> function0, InterfaceC6495t0 interfaceC6495t0) {
        this.file = file;
        this.deviceIdGenerator = function0;
        this.logger = interfaceC6495t0;
        try {
            file.createNewFile();
        } catch (Throwable th2) {
            this.logger.b("Failed to created device ID file", th2);
        }
        this.synchronizedStreamableStore = new W0<>(this.file);
    }

    private final String c(FileChannel channel, UUID uuid) throws InterruptedException, IOException {
        String str;
        FileLock fileLockE = e(channel);
        String str2 = null;
        if (fileLockE == null) {
            return null;
        }
        try {
            L lB = b();
            if (lB != null) {
                str2 = lB.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String();
            }
            if (str2 != null) {
                str = lB.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String();
            } else {
                L l10 = new L(uuid.toString());
                this.synchronizedStreamableStore.b(l10);
                str = l10.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String();
            }
            fileLockE.release();
            return str;
        } catch (Throwable th2) {
            fileLockE.release();
            throw th2;
        }
    }
}
