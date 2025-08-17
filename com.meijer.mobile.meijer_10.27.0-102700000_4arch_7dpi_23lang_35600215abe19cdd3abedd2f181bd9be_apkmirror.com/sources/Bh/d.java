package Bh;

import Dh.CustomerPropertiesResponse;
import Dh.Preference;
import Dh.p;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import yo.k;
import zh.j;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B\u0019\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0082@¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\r\u0010\u000bJ\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0013\u0010\u000bJ\u0010\u0010\u0015\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b\u0015\u0010\u000bJ$\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001e¨\u0006\u001f"}, d2 = {"LBh/d;", "", "Lzh/j;", "preferencesDataSource", "Lyo/k;", "userManager", "<init>", "(Lzh/j;Lyo/k;)V", "", "LDh/o;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "f", "LDh/p;", "preferenceKey", "a", "(LDh/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LDh/l;", "c", "LDh/t;", "d", "preferenceList", "e", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isDeviceNotificationEnabled", "LDh/w;", "g", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lzh/j;", "Lyo/k;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j preferencesDataSource;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k userManager;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"LBh/d$a;", "", "", "registrationIdKey", "", "deviceType", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "b", "I", "()I", "c", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        public static final a f2402c = new a("FCM", 0, "FCM_PUSH_REGISTRATION_ID_KEY", 5);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ a[] f2403d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f2404e;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String registrationIdKey;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int deviceType;

        static {
            a[] aVarArrA = a();
            f2403d = aVarArrA;
            f2404e = EnumEntriesKt.a(aVarArrA);
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f2402c};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f2403d.clone();
        }

        /* renamed from: b, reason: from getter */
        public final int getDeviceType() {
            return this.deviceType;
        }

        /* renamed from: e, reason: from getter */
        public final String getRegistrationIdKey() {
            return this.registrationIdKey;
        }

        private a(String str, int i10, String str2, int i11) {
            this.registrationIdKey = str2;
            this.deviceType = i11;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.domain.PreferencesRepository", f = "PreferencesRepository.kt", l = {41, 42}, m = "getPreferences")
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f2407a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f2408b;

        /* renamed from: d, reason: collision with root package name */
        int f2410d;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2408b = obj;
            this.f2410d |= Integer.MIN_VALUE;
            return d.this.d(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.domain.PreferencesRepository", f = "PreferencesRepository.kt", l = {51, 56}, m = "updateNotificationSettings")
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        boolean f2411a;

        /* renamed from: b, reason: collision with root package name */
        long f2412b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f2413c;

        /* renamed from: e, reason: collision with root package name */
        int f2415e;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2413c = obj;
            this.f2415e |= Integer.MIN_VALUE;
            return d.this.g(false, this);
        }
    }

    public d(j preferencesDataSource, k userManager) {
        Intrinsics.j(preferencesDataSource, "preferencesDataSource");
        Intrinsics.j(userManager, "userManager");
        this.preferencesDataSource = preferencesDataSource;
        this.userManager = userManager;
    }

    private final Object b(Continuation<? super List<Preference>> continuation) {
        return this.preferencesDataSource.h(continuation);
    }

    public final Object a(p pVar, Continuation<? super Preference> continuation) {
        return this.preferencesDataSource.g(pVar, continuation);
    }

    public final Object c(Continuation<? super CustomerPropertiesResponse> continuation) {
        return this.preferencesDataSource.i(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(kotlin.coroutines.Continuation<? super Dh.PreferencesResponse> r7) throws android.security.keystore.UserNotAuthenticatedException {
        /*
            r6 = this;
            boolean r0 = r7 instanceof Bh.d.b
            if (r0 == 0) goto L13
            r0 = r7
            Bh.d$b r0 = (Bh.d.b) r0
            int r1 = r0.f2410d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2410d = r1
            goto L18
        L13:
            Bh.d$b r0 = new Bh.d$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f2408b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f2410d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.f2407a
            java.util.List r0 = (java.util.List) r0
            kotlin.ResultKt.b(r7)
            goto L58
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            kotlin.ResultKt.b(r7)
            goto L48
        L3c:
            kotlin.ResultKt.b(r7)
            r0.f2410d = r4
            java.lang.Object r7 = r6.b(r0)
            if (r7 != r1) goto L48
            goto L54
        L48:
            java.util.List r7 = (java.util.List) r7
            r0.f2407a = r7
            r0.f2410d = r3
            java.lang.Object r0 = r6.c(r0)
            if (r0 != r1) goto L55
        L54:
            return r1
        L55:
            r5 = r0
            r0 = r7
            r7 = r5
        L58:
            Dh.l r7 = (Dh.CustomerPropertiesResponse) r7
            boolean r7 = r7.getHasEmailVerified()
            Dh.t r1 = new Dh.t
            r1.<init>(r0, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Bh.d.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object e(List<Preference> list, Continuation<? super List<Preference>> continuation) {
        return this.preferencesDataSource.m(list, continuation);
    }

    public final Object f(Continuation<? super Boolean> continuation) {
        return this.preferencesDataSource.k(continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        if (r11 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        if (r11 == r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(boolean r10, kotlin.coroutines.Continuation<? super Dh.RegisterNotificationDeviceResponse> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof Bh.d.c
            if (r0 == 0) goto L14
            r0 = r11
            Bh.d$c r0 = (Bh.d.c) r0
            int r1 = r0.f2415e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f2415e = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            Bh.d$c r0 = new Bh.d$c
            r0.<init>(r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.f2413c
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r6.f2415e
            r7 = 0
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3c
            if (r1 == r3) goto L38
            if (r1 != r2) goto L30
            kotlin.ResultKt.b(r11)
            goto L7b
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            kotlin.ResultKt.b(r11)
            goto L62
        L3c:
            kotlin.ResultKt.b(r11)
            yo.k r11 = r9.userManager
            Bh.d$a r1 = Bh.d.a.f2402c
            java.lang.String r4 = r1.getRegistrationIdKey()
            long r4 = r11.s(r4)
            int r11 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r11 != 0) goto L65
            zh.j r11 = r9.preferencesDataSource
            int r1 = r1.getDeviceType()
            r6.f2411a = r10
            r6.f2412b = r4
            r6.f2415e = r3
            java.lang.Object r11 = r11.j(r1, r10, r6)
            if (r11 != r0) goto L62
            goto L7a
        L62:
            Dh.w r11 = (Dh.RegisterNotificationDeviceResponse) r11
            goto L7d
        L65:
            r11 = r1
            zh.j r1 = r9.preferencesDataSource
            int r11 = r11.getDeviceType()
            r6.f2411a = r10
            r6.f2412b = r4
            r6.f2415e = r2
            r3 = r10
            r2 = r11
            java.lang.Object r11 = r1.l(r2, r3, r4, r6)
            if (r11 != r0) goto L7b
        L7a:
            return r0
        L7b:
            Dh.w r11 = (Dh.RegisterNotificationDeviceResponse) r11
        L7d:
            boolean r10 = r11.getSuccess()
            if (r10 == 0) goto L93
            yo.k r10 = r9.userManager
            Bh.d$a r0 = Bh.d.a.f2402c
            java.lang.String r0 = r0.getRegistrationIdKey()
            long r1 = r11.getId()
            r10.V(r0, r1)
            return r11
        L93:
            yo.k r10 = r9.userManager
            Bh.d$a r0 = Bh.d.a.f2402c
            java.lang.String r0 = r0.getRegistrationIdKey()
            r10.V(r0, r7)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: Bh.d.g(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
