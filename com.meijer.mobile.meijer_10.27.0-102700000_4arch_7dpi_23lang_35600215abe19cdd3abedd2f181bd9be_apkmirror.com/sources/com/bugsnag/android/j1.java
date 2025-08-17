package com.bugsnag.android;

import Q6.ImmutableConfig;
import android.util.JsonReader;
import com.bugsnag.android.T0;
import com.bugsnag.android.h1;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B5\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001dR\u0014\u0010 \u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001fR\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010$R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/bugsnag/android/j1;", "", "LQ6/f;", "config", "", "deviceId", "Ljava/io/File;", "file", "Lcom/bugsnag/android/Q0;", "sharedPrefMigrator", "Lcom/bugsnag/android/t0;", "logger", "<init>", "(LQ6/f;Ljava/lang/String;Ljava/io/File;Lcom/bugsnag/android/Q0;Lcom/bugsnag/android/t0;)V", "Lcom/bugsnag/android/h1;", "user", "", "d", "(Lcom/bugsnag/android/h1;)Z", "b", "()Lcom/bugsnag/android/h1;", "initialUser", "Lcom/bugsnag/android/i1;", "a", "(Lcom/bugsnag/android/h1;)Lcom/bugsnag/android/i1;", "", "c", "(Lcom/bugsnag/android/h1;)V", "Lcom/bugsnag/android/W0;", "Lcom/bugsnag/android/W0;", "synchronizedStreamableStore", "Z", "persist", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "previousUser", "LQ6/f;", "e", "Ljava/lang/String;", "f", "Lcom/bugsnag/android/Q0;", "g", "Lcom/bugsnag/android/t0;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final W0<h1> synchronizedStreamableStore;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean persist;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference<h1> previousUser;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ImmutableConfig config;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String deviceId;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Q0 sharedPrefMigrator;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6495t0 logger;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/bugsnag/android/T0;", "event", "", "onStateChange", "(Lcom/bugsnag/android/T0;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    static final class a implements Q6.l {
        a() {
        }

        @Override // Q6.l
        public final void onStateChange(T0 t02) {
            if (t02 instanceof T0.s) {
                j1.this.c(((T0.s) t02).user);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/util/JsonReader;", "p1", "Lcom/bugsnag/android/h1;", "a", "(Landroid/util/JsonReader;)Lcom/bugsnag/android/h1;"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class b extends FunctionReference implements Function1<JsonReader, h1> {
        b(h1.Companion companion) {
            super(1, companion);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "fromReader";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.b(h1.Companion.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "fromReader(Landroid/util/JsonReader;)Lcom/bugsnag/android/User;";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h1 invoke(JsonReader jsonReader) {
            return ((h1.Companion) this.receiver).a(jsonReader);
        }
    }

    @JvmOverloads
    public j1(ImmutableConfig immutableConfig, String str, File file, Q0 q02, InterfaceC6495t0 interfaceC6495t0) throws IOException {
        this.config = immutableConfig;
        this.deviceId = str;
        this.sharedPrefMigrator = q02;
        this.logger = interfaceC6495t0;
        this.persist = immutableConfig.getPersistUser();
        this.previousUser = new AtomicReference<>(null);
        try {
            file.createNewFile();
        } catch (IOException e10) {
            this.logger.b("Failed to created device ID file", e10);
        }
        this.synchronizedStreamableStore = new W0<>(file);
    }

    private final h1 b() {
        if (this.sharedPrefMigrator.c()) {
            h1 h1VarD = this.sharedPrefMigrator.d(this.deviceId);
            c(h1VarD);
            return h1VarD;
        }
        try {
            return (h1) this.synchronizedStreamableStore.a(new b(h1.INSTANCE));
        } catch (Exception e10) {
            this.logger.b("Failed to load user info", e10);
            return null;
        }
    }

    public final void c(h1 user) {
        if (!this.persist || Intrinsics.e(user, this.previousUser.getAndSet(user))) {
            return;
        }
        try {
            this.synchronizedStreamableStore.b(user);
        } catch (Exception e10) {
            this.logger.b("Failed to persist user info", e10);
        }
    }

    private final boolean d(h1 user) {
        if (user.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String() == null && user.getName() == null && user.getEmail() == null) {
            return false;
        }
        return true;
    }

    public final i1 a(h1 initialUser) {
        i1 i1Var;
        if (!d(initialUser)) {
            if (this.persist) {
                initialUser = b();
            } else {
                initialUser = null;
            }
        }
        if (initialUser != null && d(initialUser)) {
            i1Var = new i1(initialUser);
        } else {
            i1Var = new i1(new h1(this.deviceId, null, null));
        }
        i1Var.addObserver(new a());
        return i1Var;
    }

    public /* synthetic */ j1(ImmutableConfig immutableConfig, String str, File file, Q0 q02, InterfaceC6495t0 interfaceC6495t0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(immutableConfig, str, (i10 & 4) != 0 ? new File(immutableConfig.v().getValue(), "user-info") : file, q02, interfaceC6495t0);
    }
}
