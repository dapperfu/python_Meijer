package fo;

import Qo.l;
import com.medallia.digital.mobilesdk.l3;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import np.InterfaceC15996e;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lfo/b;", "Lnp/e;", "LQo/l$h;", "Lfo/e;", "rewardsRepository", "LRo/c;", "productsRepository", "<init>", "(Lfo/e;LRo/c;)V", "query", "d", "(LQo/l$h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lfo/e;", "c", "()Lfo/e;", "b", "LRo/c;", "()LRo/c;", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: fo.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C14046b implements InterfaceC15996e<l.Reward> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e rewardsRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Ro.c productsRepository;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.mperks.networking.api.RewardProductQueryDataSource", f = "RewardProductQueryDataSource.kt", l = {l3.f93325e, 39}, m = "load")
    /* renamed from: fo.b$a */
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f132476a;

        /* renamed from: b, reason: collision with root package name */
        Object f132477b;

        /* renamed from: c, reason: collision with root package name */
        Object f132478c;

        /* renamed from: d, reason: collision with root package name */
        Object f132479d;

        /* renamed from: e, reason: collision with root package name */
        Object f132480e;

        /* renamed from: f, reason: collision with root package name */
        Object f132481f;

        /* renamed from: g, reason: collision with root package name */
        int f132482g;

        /* renamed from: h, reason: collision with root package name */
        int f132483h;

        /* renamed from: i, reason: collision with root package name */
        int f132484i;

        /* renamed from: j, reason: collision with root package name */
        int f132485j;

        /* renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f132486k;

        /* renamed from: m, reason: collision with root package name */
        int f132488m;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f132486k = obj;
            this.f132488m |= Integer.MIN_VALUE;
            return C14046b.this.a(null, this);
        }
    }

    public C14046b(e rewardsRepository, Ro.c productsRepository) {
        Intrinsics.j(rewardsRepository, "rewardsRepository");
        Intrinsics.j(productsRepository, "productsRepository");
        this.rewardsRepository = rewardsRepository;
        this.productsRepository = productsRepository;
    }

    /* renamed from: b, reason: from getter */
    public final Ro.c getProductsRepository() {
        return this.productsRepository;
    }

    /* renamed from: c, reason: from getter */
    public final e getRewardsRepository() {
        return this.rewardsRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c7 A[Catch: Exception -> 0x007b, TRY_LEAVE, TryCatch #3 {Exception -> 0x007b, blocks: (B:20:0x0077, B:31:0x00bf, B:33:0x00c7, B:53:0x019c, B:54:0x01ba), top: B:72:0x0077 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0118 A[Catch: Exception -> 0x0122, TryCatch #4 {Exception -> 0x0122, blocks: (B:37:0x00f2, B:41:0x0112, B:43:0x0118, B:47:0x0129, B:51:0x0137, B:46:0x0125), top: B:73:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0125 A[Catch: Exception -> 0x0122, TryCatch #4 {Exception -> 0x0122, blocks: (B:37:0x00f2, B:41:0x0112, B:43:0x0118, B:47:0x0129, B:51:0x0137, B:46:0x0125), top: B:73:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019c A[Catch: Exception -> 0x007b, TRY_ENTER, TryCatch #3 {Exception -> 0x007b, blocks: (B:20:0x0077, B:31:0x00bf, B:33:0x00c7, B:53:0x019c, B:54:0x01ba), top: B:72:0x0077 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // np.InterfaceC15996e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(Qo.l.Reward r46, kotlin.coroutines.Continuation<? super Qo.l.Reward> r47) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fo.C14046b.a(Qo.l$h, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
