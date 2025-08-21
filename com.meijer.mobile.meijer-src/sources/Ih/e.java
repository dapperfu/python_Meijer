package Ih;

import androidx.view.c0;
import androidx.view.d0;
import bk.AbstractC6392a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.C16563h;
import pv.InterfaceC16549B;
import pv.P;
import pv.S;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LIh/e;", "Landroidx/lifecycle/c0;", "Lcom/meijer/mobile/accounts/ux/preferences/a;", "preferenceItemProvider", "<init>", "(Lcom/meijer/mobile/accounts/ux/preferences/a;)V", "", "isNotificationEnabled", "", "o", "(Z)V", "a", "Lcom/meijer/mobile/accounts/ux/preferences/a;", "Lpv/B;", "LIh/e$a;", "b", "Lpv/B;", "_viewState", "Lpv/P;", "c", "Lpv/P;", "p", "()Lpv/P;", "viewState", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class e extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.meijer.mobile.accounts.ux.preferences.a preferenceItemProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<CommunicationsCardViewState> _viewState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final P<CommunicationsCardViewState> viewState;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ<\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u0011¨\u0006\u001f"}, d2 = {"LIh/e$a;", "", "", "isLoading", "Lbk/a;", "title", "description", "", "image", "<init>", "(ZLbk/a;Lbk/a;I)V", "a", "(ZLbk/a;Lbk/a;I)LIh/e$a;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "f", "()Z", "b", "Lbk/a;", "e", "()Lbk/a;", "c", "d", "I", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ih.e$a, reason: from toString */
    public static final /* data */ class CommunicationsCardViewState {

        /* renamed from: e, reason: collision with root package name */
        public static final int f14616e = AbstractC6392a.f60445b;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isLoading;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a title;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a description;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final int image;

        public CommunicationsCardViewState() {
            this(false, null, null, 0, 15, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CommunicationsCardViewState)) {
                return false;
            }
            CommunicationsCardViewState communicationsCardViewState = (CommunicationsCardViewState) other;
            return this.isLoading == communicationsCardViewState.isLoading && Intrinsics.e(this.title, communicationsCardViewState.title) && Intrinsics.e(this.description, communicationsCardViewState.description) && this.image == communicationsCardViewState.image;
        }

        public CommunicationsCardViewState(boolean z10, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, int i10) {
            this.isLoading = z10;
            this.title = abstractC6392a;
            this.description = abstractC6392a2;
            this.image = i10;
        }

        public static /* synthetic */ CommunicationsCardViewState b(CommunicationsCardViewState communicationsCardViewState, boolean z10, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z10 = communicationsCardViewState.isLoading;
            }
            if ((i11 & 2) != 0) {
                abstractC6392a = communicationsCardViewState.title;
            }
            if ((i11 & 4) != 0) {
                abstractC6392a2 = communicationsCardViewState.description;
            }
            if ((i11 & 8) != 0) {
                i10 = communicationsCardViewState.image;
            }
            return communicationsCardViewState.a(z10, abstractC6392a, abstractC6392a2, i10);
        }

        public final CommunicationsCardViewState a(boolean isLoading, AbstractC6392a title, AbstractC6392a description, int image) {
            return new CommunicationsCardViewState(isLoading, title, description, image);
        }

        /* renamed from: c, reason: from getter */
        public final AbstractC6392a getDescription() {
            return this.description;
        }

        /* renamed from: d, reason: from getter */
        public final int getImage() {
            return this.image;
        }

        /* renamed from: e, reason: from getter */
        public final AbstractC6392a getTitle() {
            return this.title;
        }

        /* renamed from: f, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.isLoading) * 31;
            AbstractC6392a abstractC6392a = this.title;
            int iHashCode2 = (iHashCode + (abstractC6392a == null ? 0 : abstractC6392a.hashCode())) * 31;
            AbstractC6392a abstractC6392a2 = this.description;
            return ((iHashCode2 + (abstractC6392a2 != null ? abstractC6392a2.hashCode() : 0)) * 31) + Integer.hashCode(this.image);
        }

        public String toString() {
            return "CommunicationsCardViewState(isLoading=" + this.isLoading + ", title=" + this.title + ", description=" + this.description + ", image=" + this.image + ')';
        }

        public /* synthetic */ CommunicationsCardViewState(boolean z10, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? true : z10, (i11 & 2) != 0 ? null : abstractC6392a, (i11 & 4) != 0 ? null : abstractC6392a2, (i11 & 8) != 0 ? 0 : i10);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.basescreen.cards.CommunicationsCardViewModel$fetchCommunicationsCardInfo$2", f = "CommunicationsCardViewModel.kt", l = {36}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f14621a;

        /* renamed from: b, reason: collision with root package name */
        Object f14622b;

        /* renamed from: c, reason: collision with root package name */
        Object f14623c;

        /* renamed from: d, reason: collision with root package name */
        Object f14624d;

        /* renamed from: e, reason: collision with root package name */
        int f14625e;

        /* renamed from: f, reason: collision with root package name */
        int f14626f;

        /* renamed from: g, reason: collision with root package name */
        int f14627g;

        /* renamed from: h, reason: collision with root package name */
        int f14628h;

        /* renamed from: i, reason: collision with root package name */
        int f14629i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f14630j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f14632l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z10, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f14632l = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = e.this.new b(this.f14632l, continuation);
            bVar.f14630j = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00de  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00e9  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00f5  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00f8  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 312
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Ih.e.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public e(com.meijer.mobile.accounts.ux.preferences.a preferenceItemProvider) {
        Intrinsics.j(preferenceItemProvider, "preferenceItemProvider");
        this.preferenceItemProvider = preferenceItemProvider;
        InterfaceC16549B<CommunicationsCardViewState> interfaceC16549BA = S.a(new CommunicationsCardViewState(false, null, null, 0, 15, null));
        this._viewState = interfaceC16549BA;
        this.viewState = C16563h.c(interfaceC16549BA);
    }

    public final void o(boolean isNotificationEnabled) {
        CommunicationsCardViewState value;
        InterfaceC16549B<CommunicationsCardViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, CommunicationsCardViewState.b(value, true, null, null, 0, 14, null)));
        C15809k.d(d0.a(this), null, null, new b(isNotificationEnabled, null), 3, null);
    }

    public final P<CommunicationsCardViewState> p() {
        return this.viewState;
    }
}
