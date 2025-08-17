package com.meijer.mobile.meijer.activity.shoppinglist.view;

import Ds.p;
import En.j;
import En.l;
import Fq.ShoppingListItem;
import Gn.ShoppingListTypeAheadResultItem;
import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.meijer.mobile.meijer.P;
import com.meijer.mobile.meijer.T;
import gi.InterfaceC14261a;
import hi.C14476c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001/B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ%\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\n2\u0010\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010\fJ\r\u0010 \u001a\u00020\n¢\u0006\u0004\b \u0010\fJ\r\u0010!\u001a\u00020\n¢\u0006\u0004\b!\u0010\fJ\r\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00102\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010+\u001a\u00020\u00102\u0006\u0010)\u001a\u00020(2\u0006\u0010%\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\n2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\n2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104R$\u0010;\u001a\u0004\u0018\u0001058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0018\u0010>\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010=R$\u0010E\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0016\u0010H\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010M\u001a\u0004\u0018\u00010K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010LR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010GR\u0011\u0010S\u001a\u00020P8F¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0011\u0010U\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\bT\u0010#¨\u0006V"}, d2 = {"Lcom/meijer/mobile/meijer/activity/shoppinglist/view/ShoppingListAddItemView;", "Landroid/widget/LinearLayout;", "Landroid/view/View$OnTouchListener;", "LEn/l$a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "k", "()V", "p", "Landroid/app/Activity;", "activity", "", "isTrackingFavorites", "Lgi/a;", "analyticsEngine", "f", "(Landroid/app/Activity;ZLgi/a;)V", "", "LGn/v0;", "typeAheadResults", "setTypeAheadResults", "(Ljava/util/List;)V", "Lcom/meijer/mobile/meijer/activity/shoppinglist/view/ShoppingListAddItemView$a;", "listener", "setListener", "(Lcom/meijer/mobile/meijer/activity/shoppinglist/view/ShoppingListAddItemView$a;)V", "i", "o", "h", "j", "()Z", "Landroid/view/KeyEvent;", "event", "dispatchKeyEventPreIme", "(Landroid/view/KeyEvent;)Z", "Landroid/view/View;", "v", "Landroid/view/MotionEvent;", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "LFq/c;", "item", "a", "(LFq/c;)V", "", "text", "b", "(Ljava/lang/String;)V", "Landroid/widget/EditText;", "Landroid/widget/EditText;", "getAddItemEditText", "()Landroid/widget/EditText;", "setAddItemEditText", "(Landroid/widget/EditText;)V", "addItemEditText", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "typeAheadRecycleView", "c", "Landroid/view/View;", "getOverlay", "()Landroid/view/View;", "setOverlay", "(Landroid/view/View;)V", "overlay", "d", "Z", "keyboardHidden", "e", "Lcom/meijer/mobile/meijer/activity/shoppinglist/view/ShoppingListAddItemView$a;", "LEn/l;", "LEn/l;", "typeAheadListAdapter", "g", "Lgi/a;", "", "getAddItemFieldHeight", "()I", "addItemFieldHeight", "n", "isOverlayVisible", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class ShoppingListAddItemView extends LinearLayout implements View.OnTouchListener, l.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private EditText addItemEditText;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private RecyclerView typeAheadRecycleView;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private View overlay;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean keyboardHidden;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private a listener;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final l typeAheadListAdapter;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private InterfaceC14261a analyticsEngine;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean isTrackingFavorites;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/shoppinglist/view/ShoppingListAddItemView$a;", "", "", "onScan", "()V", "LFq/c;", "shoppingListItem", "h", "(LFq/c;)V", "e0", "K", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {
        void K();

        void e0();

        void h(ShoppingListItem shoppingListItem);

        void onScan();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListAddItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.j(context, "context");
        this.typeAheadListAdapter = !isInEditMode() ? new l(this) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(ShoppingListAddItemView shoppingListAddItemView, View view) {
        a aVar = shoppingListAddItemView.listener;
        if (aVar != null) {
            aVar.onScan();
        }
    }

    private final void k() {
        EditText editText = this.addItemEditText;
        Intrinsics.g(editText);
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.meijer.mobile.meijer.activity.shoppinglist.view.f
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                return ShoppingListAddItemView.l(this.f112532a, textView, i10, keyEvent);
            }
        });
        EditText editText2 = this.addItemEditText;
        Intrinsics.g(editText2);
        editText2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.meijer.mobile.meijer.activity.shoppinglist.view.g
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                ShoppingListAddItemView.m(this.f112533a, view, z10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(ShoppingListAddItemView shoppingListAddItemView, TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6 && (keyEvent == null || keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
            return false;
        }
        EditText editText = shoppingListAddItemView.addItemEditText;
        Intrinsics.g(editText);
        String string = editText.getText().toString();
        if (StringsKt.r0(string)) {
            shoppingListAddItemView.i();
            return true;
        }
        a aVar = shoppingListAddItemView.listener;
        if (aVar != null) {
            aVar.h(new ShoppingListItem(0L, 0, 0, null, string, 0, 0, null, false, false, null, null, null, 0L, null, 32751, null));
        }
        shoppingListAddItemView.h();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(ShoppingListAddItemView shoppingListAddItemView, View view, boolean z10) {
        if (!z10) {
            shoppingListAddItemView.i();
            return;
        }
        shoppingListAddItemView.p();
        a aVar = shoppingListAddItemView.listener;
        if (aVar != null) {
            aVar.e0();
        }
        shoppingListAddItemView.keyboardHidden = false;
    }

    private final void p() {
        RecyclerView recyclerView = this.typeAheadRecycleView;
        Intrinsics.g(recyclerView);
        RecyclerView recyclerView2 = this.typeAheadRecycleView;
        Intrinsics.g(recyclerView2);
        recyclerView.scrollToPosition(recyclerView2.getTop());
        EditText editText = this.addItemEditText;
        Intrinsics.g(editText);
        if (editText.getText().toString().length() == 0) {
            View view = this.overlay;
            Intrinsics.g(view);
            view.setVisibility(0);
            RecyclerView recyclerView3 = this.typeAheadRecycleView;
            Intrinsics.g(recyclerView3);
            recyclerView3.setVisibility(8);
            return;
        }
        View view2 = this.overlay;
        Intrinsics.g(view2);
        view2.setVisibility(8);
        RecyclerView recyclerView4 = this.typeAheadRecycleView;
        Intrinsics.g(recyclerView4);
        recyclerView4.setVisibility(0);
    }

    @Override // En.l.a
    public void a(ShoppingListItem item) {
        Intrinsics.j(item, "item");
        a aVar = this.listener;
        if (aVar != null) {
            aVar.h(item);
        }
    }

    @Override // En.l.a
    public void b(String text) {
        Intrinsics.j(text, "text");
        InterfaceC14261a interfaceC14261a = this.analyticsEngine;
        Intrinsics.g(interfaceC14261a);
        interfaceC14261a.b(C14476c.a(this.isTrackingFavorites ? "event: shopping list favorites typeahead arrow" : "event: shopping list typeahead arrow"), C14476c.c("Shopping List"), C14476c.g("shopping list"));
        String str = text + ' ';
        EditText editText = this.addItemEditText;
        Intrinsics.g(editText);
        editText.setText(str);
        EditText editText2 = this.addItemEditText;
        Intrinsics.g(editText2);
        editText2.setSelection(str.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent event) {
        Intrinsics.j(event, "event");
        if (event.getKeyCode() != 4) {
            return super.dispatchKeyEventPreIme(event);
        }
        if (this.keyboardHidden) {
            i();
            this.keyboardHidden = true;
            return true;
        }
        EditText editText = this.addItemEditText;
        Intrinsics.g(editText);
        p.c(editText);
        this.keyboardHidden = true;
        return true;
    }

    public final void f(Activity activity, boolean isTrackingFavorites, InterfaceC14261a analyticsEngine) {
        Intrinsics.j(activity, "activity");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        this.addItemEditText = (EditText) activity.findViewById(T.f99200q);
        k();
        activity.findViewById(T.f98971U6).setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.shoppinglist.view.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShoppingListAddItemView.g(this.f112531a, view);
            }
        });
        this.isTrackingFavorites = isTrackingFavorites;
        this.analyticsEngine = analyticsEngine;
        setOrientation(1);
        if (isInEditMode()) {
            return;
        }
        View viewFindViewById = findViewById(T.f99045b9);
        Intrinsics.g(viewFindViewById);
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        recyclerView.setAdapter(this.typeAheadListAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.addItemDecoration(new j.a(getContext()).e(P.f98652e).d());
        this.typeAheadRecycleView = recyclerView;
        View viewFindViewById2 = findViewById(T.f98979V4);
        Intrinsics.g(viewFindViewById2);
        viewFindViewById2.setOnTouchListener(this);
        this.overlay = viewFindViewById2;
    }

    public final EditText getAddItemEditText() {
        return this.addItemEditText;
    }

    public final int getAddItemFieldHeight() {
        EditText editText = this.addItemEditText;
        if (editText == null) {
            return 0;
        }
        Intrinsics.g(editText);
        return editText.getHeight();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final View getOverlay() {
        return this.overlay;
    }

    public final void h() {
        EditText editText = this.addItemEditText;
        Intrinsics.g(editText);
        editText.setText((CharSequence) null);
        p();
    }

    public final void i() {
        EditText editText = this.addItemEditText;
        Intrinsics.g(editText);
        p.c(editText);
        EditText editText2 = this.addItemEditText;
        Intrinsics.g(editText2);
        editText2.setText((CharSequence) null);
        EditText editText3 = this.addItemEditText;
        Intrinsics.g(editText3);
        editText3.clearFocus();
        View view = this.overlay;
        Intrinsics.g(view);
        view.setVisibility(8);
        RecyclerView recyclerView = this.typeAheadRecycleView;
        Intrinsics.g(recyclerView);
        recyclerView.setVisibility(8);
        a aVar = this.listener;
        if (aVar != null) {
            aVar.K();
        }
    }

    public final boolean j() {
        EditText editText = this.addItemEditText;
        Intrinsics.g(editText);
        Editable text = editText.getText();
        Intrinsics.i(text, "getText(...)");
        return text.length() > 0;
    }

    public final boolean n() {
        View view = this.overlay;
        Intrinsics.g(view);
        if (view.isShown()) {
            return true;
        }
        RecyclerView recyclerView = this.typeAheadRecycleView;
        Intrinsics.g(recyclerView);
        return recyclerView.isShown();
    }

    public final void o() {
        EditText editText = this.addItemEditText;
        Intrinsics.g(editText);
        editText.requestFocus();
        EditText editText2 = this.addItemEditText;
        Intrinsics.g(editText2);
        p.c(editText2);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View v10, MotionEvent event) {
        Intrinsics.j(v10, "v");
        Intrinsics.j(event, "event");
        if (v10 != this.overlay) {
            return false;
        }
        i();
        return true;
    }

    public final void setAddItemEditText(EditText editText) {
        this.addItemEditText = editText;
    }

    public final void setListener(a listener) {
        this.listener = listener;
    }

    public final void setOverlay(View view) {
        this.overlay = view;
    }

    public final void setTypeAheadResults(List<ShoppingListTypeAheadResultItem> typeAheadResults) {
        l lVar = this.typeAheadListAdapter;
        Intrinsics.g(lVar);
        lVar.l(typeAheadResults);
        p();
    }
}
