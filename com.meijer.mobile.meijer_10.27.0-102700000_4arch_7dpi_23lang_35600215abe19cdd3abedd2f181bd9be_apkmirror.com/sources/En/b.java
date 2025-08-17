package En;

import En.b;
import Fq.ShoppingListItem;
import Mn.AbstractC4209b2;
import Mn.D3;
import ak.AbstractC5607a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.meijer.mobile.meijer.P;
import com.meijer.mobile.meijer.S;
import com.meijer.mobile.meijer.T;
import com.meijer.mobile.meijer.V;
import com.meijer.mobile.meijer.X;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.shoppinglist.view.ShoppingListItemCheckBox;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import ks.AbstractC15310a;
import ys.C18301b;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003>?@B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010\u001eJ\u0015\u0010 \u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\"\u0010#J\u001b\u0010$\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b$\u0010\rJ\u0015\u0010%\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u0002¢\u0006\u0004\b(\u0010&J\u001d\u0010+\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u000f¢\u0006\u0004\b+\u0010,J\u0019\u0010-\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b-\u0010!J\u0017\u0010.\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b.\u0010&J\u0015\u0010/\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b/\u0010&R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R*\u00109\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R*\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u00104\u001a\u0004\b;\u00106\"\u0004\b<\u00108¨\u0006A"}, d2 = {"LEn/b;", "Lks/a;", "LFq/c;", "Landroid/content/Context;", "context", "LEn/b$b;", "listener", "<init>", "(Landroid/content/Context;LEn/b$b;)V", "", "shoppingListItems", "", "S", "(Ljava/util/List;)V", "item", "", "position", "Q", "(LFq/c;I)V", "Landroid/view/ViewGroup;", "parent", "viewType", "Landroidx/recyclerview/widget/RecyclerView$F;", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$F;", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$F;I)V", "", "K", "()Z", "L", "I", "(LFq/c;)I", "H", "(I)LFq/c;", "P", "E", "(LFq/c;)V", "itemStatusChanged", "R", "sourcePosition", "targetPosition", "M", "(II)V", "J", "O", "N", "v", "LEn/b$b;", "Lks/a$b;", "w", "Lks/a$b;", "G", "()Lks/a$b;", "setInProgressSection", "(Lks/a$b;)V", "inProgressSection", "x", "F", "setCompletedSection", "completedSection", "b", "c", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class b extends AbstractC15310a<ShoppingListItem> {

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC0130b listener;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private AbstractC15310a.b<ShoppingListItem> inProgressSection;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private AbstractC15310a.b<ShoppingListItem> completedSection;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"LEn/b$a;", "Landroidx/recyclerview/widget/RecyclerView$F;", "Landroid/view/View;", "view", "<init>", "(LEn/b;Landroid/view/View;)V", "", "d", "()V", "LMn/b2;", "a", "LMn/b2;", "getBinding", "()LMn/b2;", "binding", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends RecyclerView.F {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final AbstractC4209b2 binding;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f9327b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, View view) {
            super(view);
            Intrinsics.j(view, "view");
            this.f9327b = bVar;
            AbstractC4209b2 abstractC4209b2K0 = AbstractC4209b2.K0(view);
            Intrinsics.i(abstractC4209b2K0, "bind(...)");
            this.binding = abstractC4209b2K0;
            abstractC4209b2K0.f20485z.setOnClickListener(new View.OnClickListener() { // from class: En.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    b.a.c(this.f9322a, view2);
                }
            });
            TextView completedSectionHeading = abstractC4209b2K0.f20484A;
            Intrinsics.i(completedSectionHeading, "completedSectionHeading");
            zj.c.a(completedSectionHeading, true);
        }

        private final void d() {
            this.f9327b.listener.D();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(a aVar, View view) {
            aVar.d();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"LEn/b$b;", "", "LFq/c;", "item", "", "m", "(LFq/c;)V", "X", "M", "D", "()V", "", "b", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: En.b$b, reason: collision with other inner class name */
    public interface InterfaceC0130b {
        void D();

        void M(ShoppingListItem item);

        void X(ShoppingListItem item);

        boolean b();

        void m(ShoppingListItem item);
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LEn/b$c;", "Landroidx/recyclerview/widget/RecyclerView$F;", "Landroid/view/View;", "itemView", "<init>", "(LEn/b;Landroid/view/View;)V", "", "i", "()V", "j", "LFq/c;", "item", "k", "(LFq/c;)V", "LMn/D3;", "a", "LMn/D3;", "getBinding", "()LMn/D3;", "binding", "b", "LFq/c;", "_item", "h", "()LFq/c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public final class c extends RecyclerView.F {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final D3 binding;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private ShoppingListItem _item;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f9330c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(final b bVar, View itemView) {
            super(itemView);
            Intrinsics.j(itemView, "itemView");
            this.f9330c = bVar;
            D3 d3K0 = D3.K0(itemView);
            Intrinsics.i(d3K0, "bind(...)");
            this.binding = d3K0;
            d3K0.getRoot().setOnClickListener(new View.OnClickListener() { // from class: En.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.c.e(bVar, this, view);
                }
            });
            d3K0.f19974z.setOnClickListener(new View.OnClickListener() { // from class: En.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.c.f(this.f9333a, view);
                }
            });
            d3K0.f19972B.setOnClickListener(new View.OnClickListener() { // from class: En.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.c.g(this.f9334a, view);
                }
            });
        }

        private final void i() {
            ShoppingListItemCheckBox shoppingListItemCheckBox = this.binding.f19974z;
            shoppingListItemCheckBox.setEnabled(false);
            shoppingListItemCheckBox.setChecked(false);
            shoppingListItemCheckBox.setIsProcessing(true);
            this.f9330c.listener.m(h());
        }

        private final void j() {
            this.f9330c.listener.M(h());
        }

        public final ShoppingListItem h() {
            ShoppingListItem shoppingListItem = this._item;
            Intrinsics.g(shoppingListItem);
            return shoppingListItem;
        }

        public final void k(ShoppingListItem item) {
            Drawable drawableA;
            Intrinsics.j(item, "item");
            this._item = item;
            String notes = item.getNotes();
            if (notes == null || StringsKt.r0(notes)) {
                TextView itemNotes = this.binding.f19973C;
                Intrinsics.i(itemNotes, "itemNotes");
                itemNotes.setVisibility(8);
            } else {
                this.binding.f19973C.setText(item.getNotes());
                TextView itemNotes2 = this.binding.f19973C;
                Intrinsics.i(itemNotes2, "itemNotes");
                itemNotes2.setVisibility(0);
            }
            ShoppingListItemCheckBox shoppingListItemCheckBox = this.binding.f19974z;
            b bVar = this.f9330c;
            shoppingListItemCheckBox.setIsProcessing(false);
            shoppingListItemCheckBox.setChecked(item.getIsComplete());
            shoppingListItemCheckBox.setEnabled(bVar.listener.b());
            TextView textView = this.binding.f19971A;
            if (item.getIsComplete()) {
                textView.setPaintFlags(this.binding.f19971A.getPaintFlags() | 16);
                textView.setTextColor(Z1.b.c(textView.getContext(), P.f98651d));
            } else {
                this.binding.f19971A.setTextColor(Z1.b.c(textView.getContext(), P.f98648a));
            }
            Intrinsics.g(textView);
            AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
            int i10 = X.f99452k;
            int quantity = item.getQuantity();
            String itemDescription = item.getItemDescription();
            String string = itemDescription != null ? StringsKt.y1(itemDescription).toString() : null;
            if (string == null) {
                string = "";
            }
            bk.d.f(textView, companion.b(i10, quantity, string));
            ImageButton imageButton = this.binding.f19972B;
            androidx.vectordrawable.graphics.drawable.f fVarB = androidx.vectordrawable.graphics.drawable.f.b(imageButton.getContext().getResources(), item.s() ? S.f98755w : item.x() ? S.f98707W : item.v() ? Bj.i.f2782t : Bj.i.f2753j1, null);
            if (fVarB != null && (drawableA = Ds.f.a(fVarB, Z1.b.c(imageButton.getContext(), P.f98650c))) != null) {
                imageButton.setImageDrawable(drawableA);
            }
            Intrinsics.g(imageButton);
            bk.d.e(imageButton, companion.d(item.s() ? Y.f99798S1 : item.x() ? Bs.a.f3259g : item.v() ? Y.f99600Hc : C18301b.f171288n, new Object[0]));
            imageButton.setVisibility(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(b bVar, c cVar, View view) {
            bVar.listener.X(cVar.h());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(c cVar, View view) {
            cVar.i();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(c cVar, View view) {
            cVar.j();
        }
    }

    @Override // ks.AbstractC15310a
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public int j(ShoppingListItem item) {
        if (item == null) {
            return -1;
        }
        int totalNumberOfTabs = getTotalNumberOfTabs();
        for (int i10 = 0; i10 < totalNumberOfTabs; i10++) {
            ShoppingListItem item2 = getItem(i10);
            if (item2 != null && item2.w(item)) {
                return i10;
            }
        }
        return -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, InterfaceC0130b listener) {
        super(context, null, false, 0, 0, 0, 0, 0);
        Intrinsics.j(context, "context");
        Intrinsics.j(listener, "listener");
        this.listener = listener;
    }

    private final void S(List<ShoppingListItem> shoppingListItems) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : shoppingListItems) {
            if (((ShoppingListItem) obj).getIsComplete()) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        Pair pair = new Pair(arrayList2, arrayList3);
        List list = (List) pair.a();
        List list2 = (List) pair.b();
        int i10 = T.f99298y9;
        AbstractC15310a.b<ShoppingListItem> bVar = new AbstractC15310a.b<>(i10, null, list2, i10, V.f99428v1, 0, 0);
        arrayList.add(bVar);
        this.inProgressSection = bVar;
        int i11 = T.f99287x9;
        AbstractC15310a.b<ShoppingListItem> bVar2 = new AbstractC15310a.b<>(i11, null, list, i11, V.f99428v1, T.f99276w9, V.f99318D0);
        arrayList.add(bVar2);
        this.completedSection = bVar2;
        y(arrayList);
        notifyDataSetChanged();
    }

    public final void E(ShoppingListItem item) {
        Intrinsics.j(item, "item");
        if (item.getIsComplete()) {
            a(this.completedSection, 0, item);
        } else {
            a(this.inProgressSection, 0, item);
            notifyDataSetChanged();
        }
    }

    public final AbstractC15310a.b<ShoppingListItem> F() {
        return this.completedSection;
    }

    public final AbstractC15310a.b<ShoppingListItem> G() {
        return this.inProgressSection;
    }

    public final ShoppingListItem H(int position) {
        List<ShoppingListItem> list;
        AbstractC15310a.b<ShoppingListItem> bVar = this.inProgressSection;
        if (bVar != null && (list = bVar.f147937d) != null) {
            if (position >= CollectionsKt.o(list)) {
                list = null;
            }
            if (list != null) {
                return list.get(position + 1);
            }
        }
        return null;
    }

    public final int I(ShoppingListItem item) {
        List<ShoppingListItem> listM;
        Intrinsics.j(item, "item");
        if (item.getIsComplete()) {
            AbstractC15310a.b<ShoppingListItem> bVar = this.completedSection;
            listM = bVar != null ? bVar.f147937d : null;
            if (listM == null) {
                listM = CollectionsKt.m();
            }
            return listM.indexOf(item);
        }
        AbstractC15310a.b<ShoppingListItem> bVar2 = this.inProgressSection;
        listM = bVar2 != null ? bVar2.f147937d : null;
        if (listM == null) {
            listM = CollectionsKt.m();
        }
        return listM.indexOf(item);
    }

    public final boolean K() {
        AbstractC15310a.b<ShoppingListItem> bVar = this.completedSection;
        return (bVar != null ? bVar.a() : 0) > 0;
    }

    public final boolean L() {
        AbstractC15310a.b<ShoppingListItem> bVar = this.inProgressSection;
        return (bVar != null ? bVar.a() : 0) > 0;
    }

    public final void M(int sourcePosition, int targetPosition) {
        AbstractC15310a.b<ShoppingListItem> bVar = this.inProgressSection;
        if (bVar != null) {
            List<ShoppingListItem> list = bVar.f147937d;
            if (list == null || list.isEmpty()) {
                bVar = null;
            }
            if (bVar == null || targetPosition < 0) {
                return;
            }
            List<ShoppingListItem> listM = bVar.f147937d;
            if (listM == null) {
                listM = CollectionsKt.m();
            }
            if (targetPosition < listM.size()) {
                ShoppingListItem shoppingListItem = bVar.f147937d.get(sourcePosition);
                if (sourcePosition < targetPosition) {
                    int i10 = sourcePosition;
                    while (i10 < targetPosition) {
                        List<ShoppingListItem> list2 = bVar.f147937d;
                        int i11 = i10 + 1;
                        list2.set(i10, list2.get(i11));
                        i10 = i11;
                    }
                } else {
                    int i12 = targetPosition + 1;
                    if (i12 <= sourcePosition) {
                        int i13 = sourcePosition;
                        while (true) {
                            List<ShoppingListItem> list3 = bVar.f147937d;
                            list3.set(i13, list3.get(i13 - 1));
                            if (i13 == i12) {
                                break;
                            } else {
                                i13--;
                            }
                        }
                    }
                }
                bVar.f147937d.set(targetPosition, shoppingListItem);
                B(false);
                notifyItemMoved(sourcePosition, targetPosition);
            }
        }
    }

    public final void N(ShoppingListItem item) {
        Intrinsics.j(item, "item");
        w(item);
    }

    public final void P(List<ShoppingListItem> shoppingListItems) {
        Intrinsics.j(shoppingListItems, "shoppingListItems");
        S(shoppingListItems);
    }

    public final void R(ShoppingListItem itemStatusChanged) {
        ShoppingListItem shoppingListItem;
        AbstractC15310a.b<ShoppingListItem> bVar;
        Intrinsics.j(itemStatusChanged, "itemStatusChanged");
        if (itemStatusChanged.getIsComplete()) {
            w(itemStatusChanged.a((32511 & 1) != 0 ? itemStatusChanged.listItemId : 0L, (32511 & 2) != 0 ? itemStatusChanged.listItemTypeId : 0, (32511 & 4) != 0 ? itemStatusChanged.itemDisplayOrder : 0, (32511 & 8) != 0 ? itemStatusChanged.itemPartNumber : null, (32511 & 16) != 0 ? itemStatusChanged.itemDescription : null, (32511 & 32) != 0 ? itemStatusChanged.quantity : 0, (32511 & 64) != 0 ? itemStatusChanged.storeId : 0, (32511 & 128) != 0 ? itemStatusChanged.notes : null, (32511 & 256) != 0 ? itemStatusChanged.isComplete : false, (32511 & 512) != 0 ? itemStatusChanged.isFavorite : false, (32511 & 1024) != 0 ? itemStatusChanged.listingId : null, (32511 & RecyclerView.m.FLAG_MOVED) != 0 ? itemStatusChanged.promotionStart : null, (32511 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? itemStatusChanged.promotionEnd : null, (32511 & 8192) != 0 ? itemStatusChanged.couponId : 0L, (32511 & 16384) != 0 ? itemStatusChanged.productDetails : null));
            bVar = this.completedSection;
            shoppingListItem = itemStatusChanged;
        } else {
            shoppingListItem = itemStatusChanged;
            w(shoppingListItem.a((32511 & 1) != 0 ? shoppingListItem.listItemId : 0L, (32511 & 2) != 0 ? shoppingListItem.listItemTypeId : 0, (32511 & 4) != 0 ? shoppingListItem.itemDisplayOrder : 0, (32511 & 8) != 0 ? shoppingListItem.itemPartNumber : null, (32511 & 16) != 0 ? shoppingListItem.itemDescription : null, (32511 & 32) != 0 ? shoppingListItem.quantity : 0, (32511 & 64) != 0 ? shoppingListItem.storeId : 0, (32511 & 128) != 0 ? shoppingListItem.notes : null, (32511 & 256) != 0 ? shoppingListItem.isComplete : true, (32511 & 512) != 0 ? shoppingListItem.isFavorite : false, (32511 & 1024) != 0 ? shoppingListItem.listingId : null, (32511 & RecyclerView.m.FLAG_MOVED) != 0 ? shoppingListItem.promotionStart : null, (32511 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? shoppingListItem.promotionEnd : null, (32511 & 8192) != 0 ? shoppingListItem.couponId : 0L, (32511 & 16384) != 0 ? shoppingListItem.productDetails : null));
            bVar = this.inProgressSection;
        }
        if (bVar != null) {
            a(bVar, 0, shoppingListItem);
        }
        notifyDataSetChanged();
    }

    @Override // ks.AbstractC15310a, androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.F holder, int position) {
        Intrinsics.j(holder, "holder");
        int itemViewType = holder.getItemViewType();
        if (itemViewType != T.f99298y9 && itemViewType != T.f99287x9) {
            super.onBindViewHolder(holder, position);
            return;
        }
        ShoppingListItem item = getItem(position);
        Intrinsics.g(item);
        ((c) holder).k(item);
    }

    @Override // ks.AbstractC15310a, androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.F onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.j(parent, "parent");
        if (viewType == T.f99287x9 || viewType == T.f99298y9) {
            View viewInflate = dj.c.b(parent).inflate(V.f99428v1, parent, false);
            Intrinsics.g(viewInflate);
            return new c(this, viewInflate);
        }
        if (viewType == T.f99276w9) {
            View viewInflate2 = dj.c.b(parent).inflate(V.f99318D0, parent, false);
            Intrinsics.g(viewInflate2);
            return new a(this, viewInflate2);
        }
        RecyclerView.F fOnCreateViewHolder = super.onCreateViewHolder(parent, viewType);
        Intrinsics.i(fOnCreateViewHolder, "onCreateViewHolder(...)");
        return fOnCreateViewHolder;
    }

    private final void Q(ShoppingListItem item, int position) {
        ShoppingListItem item2 = getItem(position);
        Intrinsics.g(item2);
        item2.E(item);
        notifyItemChanged(position);
    }

    public final void O(ShoppingListItem item) {
        Q(item, j(item));
    }
}
