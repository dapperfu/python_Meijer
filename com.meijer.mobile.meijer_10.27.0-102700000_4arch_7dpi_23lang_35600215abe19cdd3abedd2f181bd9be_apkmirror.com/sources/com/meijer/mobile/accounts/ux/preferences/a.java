package com.meijer.mobile.accounts.ux.preferences;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/meijer/mobile/accounts/ux/preferences/a;", "", "LBh/d;", "preferencesRepository", "<init>", "(LBh/d;)V", "", "isNotificationsEnabled", "", "LWh/a;", "b", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LBh/d;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Bh.d preferencesRepository;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.preferences.PreferenceItemProvider", f = "PreferenceItemProvider.kt", l = {35}, m = "getPreferences")
    /* renamed from: com.meijer.mobile.accounts.ux.preferences.a$a, reason: collision with other inner class name */
    static final class C1338a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        boolean f94603a;

        /* renamed from: b, reason: collision with root package name */
        Object f94604b;

        /* renamed from: c, reason: collision with root package name */
        Object f94605c;

        /* renamed from: d, reason: collision with root package name */
        Object f94606d;

        /* renamed from: e, reason: collision with root package name */
        Object f94607e;

        /* renamed from: f, reason: collision with root package name */
        int f94608f;

        /* renamed from: g, reason: collision with root package name */
        int f94609g;

        /* renamed from: h, reason: collision with root package name */
        int f94610h;

        /* renamed from: i, reason: collision with root package name */
        int f94611i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f94612j;

        /* renamed from: l, reason: collision with root package name */
        int f94614l;

        C1338a(Continuation<? super C1338a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f94612j = obj;
            this.f94614l |= Integer.MIN_VALUE;
            return a.this.b(false, this);
        }
    }

    public a(Bh.d preferencesRepository) {
        Intrinsics.j(preferencesRepository, "preferencesRepository");
        this.preferencesRepository = preferencesRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0231 A[PHI: r0
      0x0231: PHI (r0v26 java.lang.Object) = (r0v11 java.lang.Object), (r0v13 java.lang.Object) binds: [B:33:0x0093, B:91:0x022b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(boolean r23, kotlin.coroutines.Continuation<? super java.util.List<Wh.PreferenceGroup>> r24) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.accounts.ux.preferences.a.b(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
