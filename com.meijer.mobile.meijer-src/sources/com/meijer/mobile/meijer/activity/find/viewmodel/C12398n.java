package com.meijer.mobile.meijer.activity.find.viewmodel;

import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import pv.C16563h;
import pv.InterfaceC16549B;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0002\u001b\u0014B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/n;", "Landroidx/lifecycle/c0;", "<init>", "()V", "", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/l1;", "imageList", "", "selectedImagePosition", "", "loadGrayScaleImage", "", "n", "(Ljava/util/List;IZ)V", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/n$a;", "action", "o", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/n$a;)V", "Lpv/B;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/n$b;", "a", "Lpv/B;", "_viewStateFlow", "Lpv/P;", "m", "()Lpv/P;", "viewStateFlow", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.n, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C12398n extends androidx.view.c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<ViewState> _viewStateFlow = pv.S.a(new ViewState(null, 0, false, 7, null));

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/n$a;", "", "<init>", "()V", "a", "b", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/n$a$a;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/n$a$b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.n$a */
    public static abstract class a {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/n$a$a;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/n$a;", "", "currentItemIndex", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.n$a$a, reason: collision with other inner class name and from toString */
        public static final /* data */ class PagerSwipe extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int currentItemIndex;

            public PagerSwipe(int i10) {
                super(null);
                this.currentItemIndex = i10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PagerSwipe) && this.currentItemIndex == ((PagerSwipe) other).currentItemIndex;
            }

            public int hashCode() {
                return Integer.hashCode(this.currentItemIndex);
            }

            public String toString() {
                return "PagerSwipe(currentItemIndex=" + this.currentItemIndex + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getCurrentItemIndex() {
                return this.currentItemIndex;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/n$a$b;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/n$a;", "", "pageIndex", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.n$a$b, reason: from toString */
        public static final /* data */ class UpdatePageNumber extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int pageIndex;

            public UpdatePageNumber(int i10) {
                super(null);
                this.pageIndex = i10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UpdatePageNumber) && this.pageIndex == ((UpdatePageNumber) other).pageIndex;
            }

            public int hashCode() {
                return Integer.hashCode(this.pageIndex);
            }

            public String toString() {
                return "UpdatePageNumber(pageIndex=" + this.pageIndex + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getPageIndex() {
                return this.pageIndex;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ4\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/n$b;", "", "", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/l1;", "imageList", "", "currentIndex", "", "loadGrayScaleImage", "<init>", "(Ljava/util/List;IZ)V", "a", "(Ljava/util/List;IZ)Lcom/meijer/mobile/meijer/activity/find/viewmodel/n$b;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "I", "c", "Z", "e", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.n$b, reason: from toString */
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<ProductImageViewModel> imageList;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int currentIndex;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean loadGrayScaleImage;

        public ViewState() {
            this(null, 0, false, 7, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ViewState b(ViewState viewState, List list, int i10, boolean z10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = viewState.imageList;
            }
            if ((i11 & 2) != 0) {
                i10 = viewState.currentIndex;
            }
            if ((i11 & 4) != 0) {
                z10 = viewState.loadGrayScaleImage;
            }
            return viewState.a(list, i10, z10);
        }

        public final ViewState a(List<ProductImageViewModel> imageList, int currentIndex, boolean loadGrayScaleImage) {
            Intrinsics.j(imageList, "imageList");
            return new ViewState(imageList, currentIndex, loadGrayScaleImage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return Intrinsics.e(this.imageList, viewState.imageList) && this.currentIndex == viewState.currentIndex && this.loadGrayScaleImage == viewState.loadGrayScaleImage;
        }

        public int hashCode() {
            return (((this.imageList.hashCode() * 31) + Integer.hashCode(this.currentIndex)) * 31) + Boolean.hashCode(this.loadGrayScaleImage);
        }

        public String toString() {
            return "ViewState(imageList=" + this.imageList + ", currentIndex=" + this.currentIndex + ", loadGrayScaleImage=" + this.loadGrayScaleImage + ')';
        }

        public ViewState(List<ProductImageViewModel> imageList, int i10, boolean z10) {
            Intrinsics.j(imageList, "imageList");
            this.imageList = imageList;
            this.currentIndex = i10;
            this.loadGrayScaleImage = z10;
        }

        /* renamed from: c, reason: from getter */
        public final int getCurrentIndex() {
            return this.currentIndex;
        }

        public final List<ProductImageViewModel> d() {
            return this.imageList;
        }

        /* renamed from: e, reason: from getter */
        public final boolean getLoadGrayScaleImage() {
            return this.loadGrayScaleImage;
        }

        public /* synthetic */ ViewState(List list, int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? CollectionsKt.m() : list, (i11 & 2) != 0 ? 0 : i10, (i11 & 4) != 0 ? false : z10);
        }
    }

    public final pv.P<ViewState> m() {
        return C16563h.c(this._viewStateFlow);
    }

    public final void n(List<ProductImageViewModel> imageList, int selectedImagePosition, boolean loadGrayScaleImage) {
        ViewState value;
        Intrinsics.j(imageList, "imageList");
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewStateFlow;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, value.a(imageList, Math.max(selectedImagePosition, 0), loadGrayScaleImage)));
    }

    public final void o(a action) {
        ViewState value;
        ViewState value2;
        Intrinsics.j(action, "action");
        if (action instanceof a.PagerSwipe) {
            InterfaceC16549B<ViewState> interfaceC16549B = this._viewStateFlow;
            do {
                value2 = interfaceC16549B.getValue();
            } while (!interfaceC16549B.e(value2, ViewState.b(value2, null, ((a.PagerSwipe) action).getCurrentItemIndex(), false, 5, null)));
        } else {
            if (!(action instanceof a.UpdatePageNumber)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC16549B<ViewState> interfaceC16549B2 = this._viewStateFlow;
            do {
                value = interfaceC16549B2.getValue();
            } while (!interfaceC16549B2.e(value, ViewState.b(value, null, ((a.UpdatePageNumber) action).getPageIndex(), false, 5, null)));
        }
    }
}
