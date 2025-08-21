package com.bugsnag.android;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0018B5\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\rH\u0082 ¢\u0006\u0004\b\u0010\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\r*\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u000fJ\r\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u000fJ\u000f\u0010\u0016\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0016\u0010\u000fJ\u000f\u0010\u0017\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0017\u0010\u000fJ\u000f\u0010\u0018\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0018\u0010\u000fJ\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001dR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010 R\u0016\u0010\"\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010!¨\u0006#"}, d2 = {"Lcom/bugsnag/android/RootDetector;", "", "Lcom/bugsnag/android/N;", "deviceBuildInfo", "", "", "rootBinaryLocations", "Ljava/io/File;", "buildProps", "Lcom/bugsnag/android/D0;", "logger", "<init>", "(Lcom/bugsnag/android/N;Ljava/util/List;Ljava/io/File;Lcom/bugsnag/android/D0;)V", "", "d", "()Z", "performNativeRootChecks", "Ljava/io/Reader;", "f", "(Ljava/io/Reader;)Z", "h", "g", "b", "c", "a", "Ljava/lang/ProcessBuilder;", "processBuilder", "e", "(Ljava/lang/ProcessBuilder;)Z", "Lcom/bugsnag/android/N;", "Ljava/util/List;", "Ljava/io/File;", "Lcom/bugsnag/android/D0;", "Z", "libraryLoaded", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class RootDetector {

    /* renamed from: g, reason: collision with root package name */
    private static final File f63998g = new File("/system/build.prop");

    /* renamed from: h, reason: collision with root package name */
    private static final List<String> f63999h = CollectionsKt.p("/system/xbin/su", "/system/bin/su", "/system/app/Superuser.apk", "/system/app/SuperSU.apk", "/system/app/Superuser", "/system/app/SuperSU", "/system/xbin/daemonsu", "/su/bin");

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final N deviceBuildInfo;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<String> rootBinaryLocations;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final File buildProps;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final D0 logger;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private volatile boolean libraryLoaded;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "line", "a", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 3, mv = {1, 5, 1})
    static final class b extends Lambda implements Function1<String, String> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f64005f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str) {
            return new Regex("\\s").k(str, "");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "line", "", "a", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1})
    static final class c extends Lambda implements Function1<String, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final c f64006f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String str) {
            return Boolean.valueOf(StringsKt.W(str, "ro.debuggable=[1]", false, 2, null) || StringsKt.W(str, "ro.secure=[0]", false, 2, null));
        }
    }

    @JvmOverloads
    public RootDetector(N n10, List<String> list, File file, D0 d02) {
        this.deviceBuildInfo = n10;
        this.rootBinaryLocations = list;
        this.buildProps = file;
        this.logger = d02;
        try {
            System.loadLibrary("bugsnag-root-detection");
            this.libraryLoaded = true;
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private final native boolean performNativeRootChecks();

    public final boolean g() {
        try {
            if (b() || d() || a() || c()) {
                return true;
            }
            return h();
        } catch (Throwable th2) {
            this.logger.b("Root detection failed", th2);
            return false;
        }
    }

    private final boolean d() {
        return e(new ProcessBuilder(new String[0]));
    }

    private final boolean h() {
        if (this.libraryLoaded) {
            return performNativeRootChecks();
        }
        return false;
    }

    public final boolean a() {
        try {
            Result.Companion companion = Result.INSTANCE;
            File file = this.buildProps;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), Charsets.UTF_8), 8192);
            try {
                boolean zX = SequencesKt.x(SequencesKt.B(SequencesKt.M(TextStreamsKt.c(bufferedReader), b.f64005f), c.f64006f));
                CloseableKt.a(bufferedReader, null);
                return zX;
            } finally {
            }
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.b(ResultKt.a(th2));
            return false;
        }
    }

    public final boolean b() {
        String tags = this.deviceBuildInfo.getTags();
        return tags != null && StringsKt.d0(tags, "test-keys", false, 2, null);
    }

    public final boolean c() {
        try {
            Result.Companion companion = Result.INSTANCE;
            Iterator<String> it = this.rootBinaryLocations.iterator();
            while (it.hasNext()) {
                if (new File(it.next()).exists()) {
                    return true;
                }
            }
            Result.b(Unit.f143329a);
            return false;
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.b(ResultKt.a(th2));
            return false;
        }
    }

    public final boolean e(ProcessBuilder processBuilder) throws Throwable {
        Throwable th2;
        Process processStart;
        processBuilder.command(CollectionsKt.p("which", "su"));
        Process process = null;
        try {
            processStart = processBuilder.start();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processStart.getInputStream(), Charsets.UTF_8), 8192);
                try {
                    boolean zF = f(bufferedReader);
                    CloseableKt.a(bufferedReader, null);
                    processStart.destroy();
                    return zF;
                } finally {
                }
            } catch (IOException unused) {
                process = processStart;
                if (process == null) {
                    return false;
                }
                process.destroy();
                return false;
            } catch (Throwable th3) {
                th2 = th3;
                if (processStart != null) {
                    processStart.destroy();
                }
                throw th2;
            }
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            th2 = th4;
            processStart = null;
        }
    }

    private final boolean f(Reader reader) throws IOException {
        int i10;
        do {
            i10 = reader.read();
            if (i10 == -1) {
                return false;
            }
        } while (CharsKt.c((char) i10));
        return true;
    }

    public /* synthetic */ RootDetector(N n10, List list, File file, D0 d02, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? N.INSTANCE.a() : n10, (i10 & 2) != 0 ? f63999h : list, (i10 & 4) != 0 ? f63998g : file, d02);
    }
}
