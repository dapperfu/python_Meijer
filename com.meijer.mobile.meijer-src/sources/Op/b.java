package Op;

import Op.a;
import androidx.view.c0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import pv.C16563h;
import pv.InterfaceC16549B;
import pv.P;
import pv.S;
import xg.C18179a;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"LOp/b;", "Landroidx/lifecycle/c0;", "<init>", "()V", "Lxg/a;", "barcode", "", "m", "(Lxg/a;)V", "LOp/a;", "action", "o", "(LOp/a;)V", "", "isGranted", "p", "(Z)V", "Lpv/B;", "LOp/b$a;", "a", "Lpv/B;", "_viewState", "Lpv/P;", "b", "Lpv/P;", "n", "()Lpv/P;", "viewStateFlow", "", "c", "Ljava/util/List;", "barcodes", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class b extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<ViewState> _viewState;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final P<ViewState> viewStateFlow;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private List<C18179a> barcodes;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LOp/b$a;", "", "", "LOp/p;", "items", "", "needsCameraPermission", "<init>", "(Ljava/util/List;Z)V", "a", "(Ljava/util/List;Z)LOp/b$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Z", "getNeedsCameraPermission", "()Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Op.b$a, reason: from toString */
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<ScannedItem> items;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean needsCameraPermission;

        /* JADX WARN: Multi-variable type inference failed */
        public ViewState() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return Intrinsics.e(this.items, viewState.items) && this.needsCameraPermission == viewState.needsCameraPermission;
        }

        public ViewState(List<ScannedItem> items, boolean z10) {
            Intrinsics.j(items, "items");
            this.items = items;
            this.needsCameraPermission = z10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ViewState b(ViewState viewState, List list, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = viewState.items;
            }
            if ((i10 & 2) != 0) {
                z10 = viewState.needsCameraPermission;
            }
            return viewState.a(list, z10);
        }

        public final ViewState a(List<ScannedItem> items, boolean needsCameraPermission) {
            Intrinsics.j(items, "items");
            return new ViewState(items, needsCameraPermission);
        }

        public final List<ScannedItem> c() {
            return this.items;
        }

        public int hashCode() {
            return (this.items.hashCode() * 31) + Boolean.hashCode(this.needsCameraPermission);
        }

        public String toString() {
            return "ViewState(items=" + this.items + ", needsCameraPermission=" + this.needsCameraPermission + ')';
        }

        public /* synthetic */ ViewState(List list, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? CollectionsKt.m() : list, (i10 & 2) != 0 ? true : z10);
        }
    }

    private final synchronized void m(C18179a barcode) {
        ViewState value;
        ArrayList arrayList;
        try {
            this.barcodes.add(barcode);
            InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
            do {
                value = interfaceC16549B.getValue();
                ViewState viewState = value;
                List<C18179a> list = this.barcodes;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : list) {
                    String strB = ((C18179a) obj).b();
                    Object arrayList2 = linkedHashMap.get(strB);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(strB, arrayList2);
                    }
                    ((List) arrayList2).add(obj);
                }
                arrayList = new ArrayList(linkedHashMap.size());
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add(new ScannedItem(new ScannedBarcode((C18179a) CollectionsKt.s0((List) ((Map.Entry) it.next()).getValue())), null, r3.size(), 2, null));
                }
            } while (!interfaceC16549B.e(value, new ViewState(arrayList, false, 2, null)));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final P<ViewState> n() {
        return this.viewStateFlow;
    }

    public final void o(a action) {
        Intrinsics.j(action, "action");
        if (!(action instanceof a.Scanned)) {
            throw new NoWhenBranchMatchedException();
        }
        Iterator<T> it = ((a.Scanned) action).a().iterator();
        while (it.hasNext()) {
            m((C18179a) it.next());
        }
    }

    public final void p(boolean isGranted) {
        ViewState value;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ViewState.b(value, null, !isGranted, 1, null)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        InterfaceC16549B<ViewState> interfaceC16549BA = S.a(new ViewState(null, false, 3, 0 == true ? 1 : 0));
        this._viewState = interfaceC16549BA;
        this.viewStateFlow = C16563h.c(interfaceC16549BA);
        this.barcodes = new ArrayList();
    }
}
