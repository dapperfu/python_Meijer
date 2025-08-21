package com.meijer.mobile.meijer.activity.personalized.modals;

import Qo.l;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import np.InterfaceC15996e;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/a;", "Lnp/e;", "LQo/l$e;", "LEq/a;", "favoritesRepository", "LRo/c;", "productsRepository", "<init>", "(LEq/a;LRo/c;)V", "query", "c", "(LQo/l$e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LEq/a;", "b", "()LEq/a;", "LRo/c;", "getProductsRepository", "()LRo/c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C12562a implements InterfaceC15996e<l.Favorites> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Eq.a favoritesRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Ro.c productsRepository;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.FavoriteProductQueryDataSource", f = "FavoriteProductQueryDataSource.kt", l = {33, 44}, m = "load")
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.a$a, reason: collision with other inner class name */
    static final class C1724a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f111913a;

        /* renamed from: b, reason: collision with root package name */
        Object f111914b;

        /* renamed from: c, reason: collision with root package name */
        Object f111915c;

        /* renamed from: d, reason: collision with root package name */
        Object f111916d;

        /* renamed from: e, reason: collision with root package name */
        Object f111917e;

        /* renamed from: f, reason: collision with root package name */
        int f111918f;

        /* renamed from: g, reason: collision with root package name */
        int f111919g;

        /* renamed from: h, reason: collision with root package name */
        int f111920h;

        /* renamed from: i, reason: collision with root package name */
        int f111921i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f111922j;

        /* renamed from: l, reason: collision with root package name */
        int f111924l;

        C1724a(Continuation<? super C1724a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f111922j = obj;
            this.f111924l |= Integer.MIN_VALUE;
            return C12562a.this.a(null, this);
        }
    }

    public C12562a(Eq.a favoritesRepository, Ro.c productsRepository) {
        Intrinsics.j(favoritesRepository, "favoritesRepository");
        Intrinsics.j(productsRepository, "productsRepository");
        this.favoritesRepository = favoritesRepository;
        this.productsRepository = productsRepository;
    }

    /* renamed from: b, reason: from getter */
    public final Eq.a getFavoritesRepository() {
        return this.favoritesRepository;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // np.InterfaceC15996e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(Qo.l.Favorites r32, kotlin.coroutines.Continuation<? super Qo.l.Favorites> r33) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.personalized.modals.C12562a.a(Qo.l$e, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
