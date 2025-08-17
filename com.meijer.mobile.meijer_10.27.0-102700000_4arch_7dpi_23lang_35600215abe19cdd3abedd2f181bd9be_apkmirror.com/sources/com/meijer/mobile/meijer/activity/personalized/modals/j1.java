package com.meijer.mobile.meijer.activity.personalized.modals;

import Qo.l;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import np.InterfaceC15920e;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/j1;", "Lnp/e;", "LQo/l$j;", "LEq/b;", "shoppingListRepository", "LRo/c;", "productsRepository", "<init>", "(LEq/b;LRo/c;)V", "query", "c", "(LQo/l$j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LEq/b;", "b", "()LEq/b;", "LRo/c;", "getProductsRepository", "()LRo/c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class j1 implements InterfaceC15920e<l.ShoppingList> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Eq.b shoppingListRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Ro.c productsRepository;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ShoppingListProductQueryDataSource", f = "ShoppingListProductQueryDataSource.kt", l = {33, 44}, m = "load")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f111472a;

        /* renamed from: b, reason: collision with root package name */
        Object f111473b;

        /* renamed from: c, reason: collision with root package name */
        Object f111474c;

        /* renamed from: d, reason: collision with root package name */
        Object f111475d;

        /* renamed from: e, reason: collision with root package name */
        Object f111476e;

        /* renamed from: f, reason: collision with root package name */
        int f111477f;

        /* renamed from: g, reason: collision with root package name */
        int f111478g;

        /* renamed from: h, reason: collision with root package name */
        int f111479h;

        /* renamed from: i, reason: collision with root package name */
        int f111480i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f111481j;

        /* renamed from: l, reason: collision with root package name */
        int f111483l;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f111481j = obj;
            this.f111483l |= Integer.MIN_VALUE;
            return j1.this.a(null, this);
        }
    }

    public j1(Eq.b shoppingListRepository, Ro.c productsRepository) {
        Intrinsics.j(shoppingListRepository, "shoppingListRepository");
        Intrinsics.j(productsRepository, "productsRepository");
        this.shoppingListRepository = shoppingListRepository;
        this.productsRepository = productsRepository;
    }

    /* renamed from: b, reason: from getter */
    public final Eq.b getShoppingListRepository() {
        return this.shoppingListRepository;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0234  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // np.InterfaceC15920e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(Qo.l.ShoppingList r32, kotlin.coroutines.Continuation<? super Qo.l.ShoppingList> r33) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.personalized.modals.j1.a(Qo.l$j, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
