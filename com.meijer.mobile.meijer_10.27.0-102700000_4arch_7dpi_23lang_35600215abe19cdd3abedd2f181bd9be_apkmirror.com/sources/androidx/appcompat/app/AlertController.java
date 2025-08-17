package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import com.fullstory.FS;
import i.C14575a;
import i.C14580f;
import i.C14584j;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class AlertController {

    /* renamed from: A, reason: collision with root package name */
    NestedScrollView f45732A;

    /* renamed from: C, reason: collision with root package name */
    private Drawable f45734C;

    /* renamed from: D, reason: collision with root package name */
    private ImageView f45735D;

    /* renamed from: E, reason: collision with root package name */
    private TextView f45736E;

    /* renamed from: F, reason: collision with root package name */
    private TextView f45737F;

    /* renamed from: G, reason: collision with root package name */
    private View f45738G;

    /* renamed from: H, reason: collision with root package name */
    ListAdapter f45739H;

    /* renamed from: J, reason: collision with root package name */
    private int f45741J;

    /* renamed from: K, reason: collision with root package name */
    private int f45742K;

    /* renamed from: L, reason: collision with root package name */
    int f45743L;

    /* renamed from: M, reason: collision with root package name */
    int f45744M;

    /* renamed from: N, reason: collision with root package name */
    int f45745N;

    /* renamed from: O, reason: collision with root package name */
    int f45746O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f45747P;

    /* renamed from: R, reason: collision with root package name */
    Handler f45749R;

    /* renamed from: a, reason: collision with root package name */
    private final Context f45751a;

    /* renamed from: b, reason: collision with root package name */
    final q f45752b;

    /* renamed from: c, reason: collision with root package name */
    private final Window f45753c;

    /* renamed from: d, reason: collision with root package name */
    private final int f45754d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f45755e;

    /* renamed from: f, reason: collision with root package name */
    private CharSequence f45756f;

    /* renamed from: g, reason: collision with root package name */
    ListView f45757g;

    /* renamed from: h, reason: collision with root package name */
    private View f45758h;

    /* renamed from: i, reason: collision with root package name */
    private int f45759i;

    /* renamed from: j, reason: collision with root package name */
    private int f45760j;

    /* renamed from: k, reason: collision with root package name */
    private int f45761k;

    /* renamed from: l, reason: collision with root package name */
    private int f45762l;

    /* renamed from: m, reason: collision with root package name */
    private int f45763m;

    /* renamed from: o, reason: collision with root package name */
    Button f45765o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f45766p;

    /* renamed from: q, reason: collision with root package name */
    Message f45767q;

    /* renamed from: r, reason: collision with root package name */
    private Drawable f45768r;

    /* renamed from: s, reason: collision with root package name */
    Button f45769s;

    /* renamed from: t, reason: collision with root package name */
    private CharSequence f45770t;

    /* renamed from: u, reason: collision with root package name */
    Message f45771u;

    /* renamed from: v, reason: collision with root package name */
    private Drawable f45772v;

    /* renamed from: w, reason: collision with root package name */
    Button f45773w;

    /* renamed from: x, reason: collision with root package name */
    private CharSequence f45774x;

    /* renamed from: y, reason: collision with root package name */
    Message f45775y;

    /* renamed from: z, reason: collision with root package name */
    private Drawable f45776z;

    /* renamed from: n, reason: collision with root package name */
    private boolean f45764n = false;

    /* renamed from: B, reason: collision with root package name */
    private int f45733B = 0;

    /* renamed from: I, reason: collision with root package name */
    int f45740I = -1;

    /* renamed from: Q, reason: collision with root package name */
    private int f45748Q = 0;

    /* renamed from: S, reason: collision with root package name */
    private final View.OnClickListener f45750S = new a();

    public static class RecycleListView extends ListView {

        /* renamed from: a, reason: collision with root package name */
        private final int f45777a;

        /* renamed from: b, reason: collision with root package name */
        private final int f45778b;

        public void a(boolean z10, boolean z11) {
            if (z11 && z10) {
                return;
            }
            setPadding(getPaddingLeft(), z10 ? getPaddingTop() : this.f45777a, getPaddingRight(), z11 ? getPaddingBottom() : this.f45778b);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C14584j.f136852k2);
            this.f45778b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C14584j.f136857l2, -1);
            this.f45777a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C14584j.f136862m2, -1);
        }
    }

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            Message messageObtain = (view != alertController.f45765o || (message3 = alertController.f45767q) == null) ? (view != alertController.f45769s || (message2 = alertController.f45771u) == null) ? (view != alertController.f45773w || (message = alertController.f45775y) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f45749R.obtainMessage(1, alertController2.f45752b).sendToTarget();
        }
    }

    public static class b {

        /* renamed from: A, reason: collision with root package name */
        public int f45780A;

        /* renamed from: B, reason: collision with root package name */
        public int f45781B;

        /* renamed from: C, reason: collision with root package name */
        public int f45782C;

        /* renamed from: D, reason: collision with root package name */
        public int f45783D;

        /* renamed from: F, reason: collision with root package name */
        public boolean[] f45785F;

        /* renamed from: G, reason: collision with root package name */
        public boolean f45786G;

        /* renamed from: H, reason: collision with root package name */
        public boolean f45787H;

        /* renamed from: J, reason: collision with root package name */
        public DialogInterface.OnMultiChoiceClickListener f45789J;

        /* renamed from: K, reason: collision with root package name */
        public Cursor f45790K;

        /* renamed from: L, reason: collision with root package name */
        public String f45791L;

        /* renamed from: M, reason: collision with root package name */
        public String f45792M;

        /* renamed from: N, reason: collision with root package name */
        public boolean f45793N;

        /* renamed from: O, reason: collision with root package name */
        public AdapterView.OnItemSelectedListener f45794O;

        /* renamed from: a, reason: collision with root package name */
        public final Context f45796a;

        /* renamed from: b, reason: collision with root package name */
        public final LayoutInflater f45797b;

        /* renamed from: d, reason: collision with root package name */
        public Drawable f45799d;

        /* renamed from: f, reason: collision with root package name */
        public CharSequence f45801f;

        /* renamed from: g, reason: collision with root package name */
        public View f45802g;

        /* renamed from: h, reason: collision with root package name */
        public CharSequence f45803h;

        /* renamed from: i, reason: collision with root package name */
        public CharSequence f45804i;

        /* renamed from: j, reason: collision with root package name */
        public Drawable f45805j;

        /* renamed from: k, reason: collision with root package name */
        public DialogInterface.OnClickListener f45806k;

        /* renamed from: l, reason: collision with root package name */
        public CharSequence f45807l;

        /* renamed from: m, reason: collision with root package name */
        public Drawable f45808m;

        /* renamed from: n, reason: collision with root package name */
        public DialogInterface.OnClickListener f45809n;

        /* renamed from: o, reason: collision with root package name */
        public CharSequence f45810o;

        /* renamed from: p, reason: collision with root package name */
        public Drawable f45811p;

        /* renamed from: q, reason: collision with root package name */
        public DialogInterface.OnClickListener f45812q;

        /* renamed from: s, reason: collision with root package name */
        public DialogInterface.OnCancelListener f45814s;

        /* renamed from: t, reason: collision with root package name */
        public DialogInterface.OnDismissListener f45815t;

        /* renamed from: u, reason: collision with root package name */
        public DialogInterface.OnKeyListener f45816u;

        /* renamed from: v, reason: collision with root package name */
        public CharSequence[] f45817v;

        /* renamed from: w, reason: collision with root package name */
        public ListAdapter f45818w;

        /* renamed from: x, reason: collision with root package name */
        public DialogInterface.OnClickListener f45819x;

        /* renamed from: y, reason: collision with root package name */
        public int f45820y;

        /* renamed from: z, reason: collision with root package name */
        public View f45821z;

        /* renamed from: c, reason: collision with root package name */
        public int f45798c = 0;

        /* renamed from: e, reason: collision with root package name */
        public int f45800e = 0;

        /* renamed from: E, reason: collision with root package name */
        public boolean f45784E = false;

        /* renamed from: I, reason: collision with root package name */
        public int f45788I = -1;

        /* renamed from: P, reason: collision with root package name */
        public boolean f45795P = true;

        /* renamed from: r, reason: collision with root package name */
        public boolean f45813r = true;

        class a extends ArrayAdapter<CharSequence> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ RecycleListView f45822a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i10, int i11, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i10, i11, charSequenceArr);
                this.f45822a = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i10, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i10, view, viewGroup);
                boolean[] zArr = b.this.f45785F;
                if (zArr != null && zArr[i10]) {
                    this.f45822a.setItemChecked(i10, true);
                }
                return view2;
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$b$b, reason: collision with other inner class name */
        class C0954b extends CursorAdapter {

            /* renamed from: a, reason: collision with root package name */
            private final int f45824a;

            /* renamed from: b, reason: collision with root package name */
            private final int f45825b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ RecycleListView f45826c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ AlertController f45827d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0954b(Context context, Cursor cursor, boolean z10, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z10);
                this.f45826c = recycleListView;
                this.f45827d = alertController;
                Cursor cursor2 = getCursor();
                this.f45824a = cursor2.getColumnIndexOrThrow(b.this.f45791L);
                this.f45825b = cursor2.getColumnIndexOrThrow(b.this.f45792M);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return b.this.f45797b.inflate(this.f45827d.f45744M, viewGroup, false);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f45824a));
                RecycleListView recycleListView = this.f45826c;
                int position = cursor.getPosition();
                boolean z10 = true;
                if (cursor.getInt(this.f45825b) != 1) {
                    z10 = false;
                }
                recycleListView.setItemChecked(position, z10);
            }
        }

        class c implements AdapterView.OnItemClickListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AlertController f45829a;

            c(AlertController alertController) {
                this.f45829a = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                b.this.f45819x.onClick(this.f45829a.f45752b, i10);
                if (b.this.f45787H) {
                    return;
                }
                this.f45829a.f45752b.dismiss();
            }
        }

        class d implements AdapterView.OnItemClickListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ RecycleListView f45831a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AlertController f45832b;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f45831a = recycleListView;
                this.f45832b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                boolean[] zArr = b.this.f45785F;
                if (zArr != null) {
                    zArr[i10] = this.f45831a.isItemChecked(i10);
                }
                b.this.f45789J.onClick(this.f45832b.f45752b, i10, this.f45831a.isItemChecked(i10));
            }
        }

        private void b(AlertController alertController) {
            b bVar;
            AlertController alertController2;
            ListAdapter dVar;
            RecycleListView recycleListView = (RecycleListView) this.f45797b.inflate(alertController.f45743L, (ViewGroup) null);
            if (!this.f45786G) {
                bVar = this;
                alertController2 = alertController;
                int i10 = bVar.f45787H ? alertController2.f45745N : alertController2.f45746O;
                if (bVar.f45790K != null) {
                    dVar = new SimpleCursorAdapter(bVar.f45796a, i10, bVar.f45790K, new String[]{bVar.f45791L}, new int[]{R.id.text1});
                } else {
                    dVar = bVar.f45818w;
                    if (dVar == null) {
                        dVar = new d(bVar.f45796a, i10, R.id.text1, bVar.f45817v);
                    }
                }
            } else if (this.f45790K == null) {
                bVar = this;
                dVar = bVar.new a(this.f45796a, alertController.f45744M, R.id.text1, this.f45817v, recycleListView);
                recycleListView = recycleListView;
                alertController2 = alertController;
            } else {
                bVar = this;
                alertController2 = alertController;
                dVar = bVar.new C0954b(bVar.f45796a, bVar.f45790K, false, recycleListView, alertController2);
            }
            alertController2.f45739H = dVar;
            alertController2.f45740I = bVar.f45788I;
            if (bVar.f45819x != null) {
                recycleListView.setOnItemClickListener(new c(alertController2));
            } else if (bVar.f45789J != null) {
                recycleListView.setOnItemClickListener(new d(recycleListView, alertController2));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = bVar.f45794O;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (bVar.f45787H) {
                recycleListView.setChoiceMode(1);
            } else if (bVar.f45786G) {
                recycleListView.setChoiceMode(2);
            }
            alertController2.f45757g = recycleListView;
        }

        public void a(AlertController alertController) {
            AlertController alertController2;
            View view = this.f45802g;
            if (view != null) {
                alertController.l(view);
            } else {
                CharSequence charSequence = this.f45801f;
                if (charSequence != null) {
                    alertController.q(charSequence);
                }
                Drawable drawable = this.f45799d;
                if (drawable != null) {
                    alertController.n(drawable);
                }
                int i10 = this.f45798c;
                if (i10 != 0) {
                    alertController.m(i10);
                }
                int i11 = this.f45800e;
                if (i11 != 0) {
                    alertController.m(alertController.d(i11));
                }
            }
            CharSequence charSequence2 = this.f45803h;
            if (charSequence2 != null) {
                alertController.o(charSequence2);
            }
            CharSequence charSequence3 = this.f45804i;
            if (charSequence3 == null && this.f45805j == null) {
                alertController2 = alertController;
            } else {
                alertController.k(-1, charSequence3, this.f45806k, null, this.f45805j);
                alertController2 = alertController;
            }
            CharSequence charSequence4 = this.f45807l;
            if (charSequence4 != null || this.f45808m != null) {
                alertController2.k(-2, charSequence4, this.f45809n, null, this.f45808m);
            }
            CharSequence charSequence5 = this.f45810o;
            if (charSequence5 != null || this.f45811p != null) {
                alertController2.k(-3, charSequence5, this.f45812q, null, this.f45811p);
            }
            if (this.f45817v != null || this.f45790K != null || this.f45818w != null) {
                b(alertController2);
            }
            View view2 = this.f45821z;
            if (view2 != null) {
                if (this.f45784E) {
                    alertController2.t(view2, this.f45780A, this.f45781B, this.f45782C, this.f45783D);
                    return;
                } else {
                    alertController2.s(view2);
                    return;
                }
            }
            int i12 = this.f45820y;
            if (i12 != 0) {
                alertController2.r(i12);
            }
        }

        public b(Context context) {
            this.f45796a = context;
            this.f45797b = (LayoutInflater) context.getSystemService("layout_inflater");
        }
    }

    private static final class c extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<DialogInterface> f45834a;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f45834a.get(), message.what);
            } else {
                if (i10 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }

        public c(DialogInterface dialogInterface) {
            this.f45834a = new WeakReference<>(dialogInterface);
        }
    }

    public Button c(int i10) {
        if (i10 == -3) {
            return this.f45773w;
        }
        if (i10 == -2) {
            return this.f45769s;
        }
        if (i10 != -1) {
            return null;
        }
        return this.f45765o;
    }

    public void m(int i10) {
        this.f45734C = null;
        this.f45733B = i10;
        ImageView imageView = this.f45735D;
        if (imageView != null) {
            if (i10 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                FS.Resources_setImageResource(this.f45735D, this.f45733B);
            }
        }
    }

    public void r(int i10) {
        this.f45758h = null;
        this.f45759i = i10;
        this.f45764n = false;
    }

    private static class d extends ArrayAdapter<CharSequence> {
        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }

        public d(Context context, int i10, int i11, CharSequence[] charSequenceArr) {
            super(context, i10, i11, charSequenceArr);
        }
    }

    private ViewGroup i(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int j() {
        int i10 = this.f45742K;
        return i10 == 0 ? this.f45741J : this.f45748Q == 1 ? i10 : this.f45741J;
    }

    private void p(ViewGroup viewGroup, View view, int i10, int i11) {
        View viewFindViewById = this.f45753c.findViewById(C14580f.f136643v);
        View viewFindViewById2 = this.f45753c.findViewById(C14580f.f136642u);
        ViewCompat.E0(view, i10, i11);
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            viewGroup.removeView(viewFindViewById2);
        }
    }

    private void v(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f45753c.findViewById(C14580f.f136644w);
        this.f45732A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f45732A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.f45737F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f45756f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f45732A.removeView(this.f45737F);
        if (this.f45757g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f45732A.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(this.f45732A);
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup2.addView(this.f45757g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    private void w(ViewGroup viewGroup) {
        View viewInflate = this.f45758h;
        if (viewInflate == null) {
            viewInflate = this.f45759i != 0 ? LayoutInflater.from(this.f45751a).inflate(this.f45759i, viewGroup, false) : null;
        }
        boolean z10 = viewInflate != null;
        if (!z10 || !a(viewInflate)) {
            this.f45753c.setFlags(131072, 131072);
        }
        if (!z10) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f45753c.findViewById(C14580f.f136635n);
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        if (this.f45764n) {
            frameLayout.setPadding(this.f45760j, this.f45761k, this.f45762l, this.f45763m);
        }
        if (this.f45757g != null) {
            ((LinearLayout.LayoutParams) ((LinearLayoutCompat.a) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    private void x(ViewGroup viewGroup) {
        if (this.f45738G != null) {
            viewGroup.addView(this.f45738G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f45753c.findViewById(C14580f.f136620F).setVisibility(8);
            return;
        }
        this.f45735D = (ImageView) this.f45753c.findViewById(R.id.icon);
        if (TextUtils.isEmpty(this.f45755e) || !this.f45747P) {
            this.f45753c.findViewById(C14580f.f136620F).setVisibility(8);
            this.f45735D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f45753c.findViewById(C14580f.f136631j);
        this.f45736E = textView;
        textView.setText(this.f45755e);
        int i10 = this.f45733B;
        if (i10 != 0) {
            FS.Resources_setImageResource(this.f45735D, i10);
            return;
        }
        Drawable drawable = this.f45734C;
        if (drawable != null) {
            this.f45735D.setImageDrawable(drawable);
        } else {
            this.f45736E.setPadding(this.f45735D.getPaddingLeft(), this.f45735D.getPaddingTop(), this.f45735D.getPaddingRight(), this.f45735D.getPaddingBottom());
            this.f45735D.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void y() {
        View viewFindViewById;
        ListAdapter listAdapter;
        View viewFindViewById2;
        View viewFindViewById3 = this.f45753c.findViewById(C14580f.f136641t);
        View viewFindViewById4 = viewFindViewById3.findViewById(C14580f.f136621G);
        View viewFindViewById5 = viewFindViewById3.findViewById(C14580f.f136634m);
        View viewFindViewById6 = viewFindViewById3.findViewById(C14580f.f136632k);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(C14580f.f136636o);
        w(viewGroup);
        View viewFindViewById7 = viewGroup.findViewById(C14580f.f136621G);
        View viewFindViewById8 = viewGroup.findViewById(C14580f.f136634m);
        View viewFindViewById9 = viewGroup.findViewById(C14580f.f136632k);
        ViewGroup viewGroupI = i(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupI2 = i(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupI3 = i(viewFindViewById9, viewFindViewById6);
        v(viewGroupI2);
        u(viewGroupI3);
        x(viewGroupI);
        boolean z10 = viewGroup.getVisibility() != 8;
        boolean z11 = (viewGroupI == null || viewGroupI.getVisibility() == 8) ? 0 : 1;
        boolean z12 = (viewGroupI3 == null || viewGroupI3.getVisibility() == 8) ? false : true;
        if (!z12 && viewGroupI2 != null && (viewFindViewById2 = viewGroupI2.findViewById(C14580f.f136616B)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z11 != 0) {
            NestedScrollView nestedScrollView = this.f45732A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById10 = (this.f45756f == null && this.f45757g == null) ? null : viewGroupI.findViewById(C14580f.f136619E);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupI2 != null && (viewFindViewById = viewGroupI2.findViewById(C14580f.f136617C)) != null) {
            viewFindViewById.setVisibility(0);
        }
        ListView listView = this.f45757g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z11, z12);
        }
        if (!z10) {
            View view = this.f45757g;
            if (view == null) {
                view = this.f45732A;
            }
            if (view != null) {
                p(viewGroupI2, view, z11 | (z12 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f45757g;
        if (listView2 == null || (listAdapter = this.f45739H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i10 = this.f45740I;
        if (i10 > -1) {
            listView2.setItemChecked(i10, true);
            listView2.setSelection(i10);
        }
    }

    private static boolean z(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C14575a.f136534m, typedValue, true);
        return typedValue.data != 0;
    }

    public int d(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f45751a.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView e() {
        return this.f45757g;
    }

    public boolean g(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f45732A;
        return nestedScrollView != null && nestedScrollView.t(keyEvent);
    }

    public boolean h(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f45732A;
        return nestedScrollView != null && nestedScrollView.t(keyEvent);
    }

    public void k(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f45749R.obtainMessage(i10, onClickListener);
        }
        if (i10 == -3) {
            this.f45774x = charSequence;
            this.f45775y = message;
            this.f45776z = drawable;
        } else if (i10 == -2) {
            this.f45770t = charSequence;
            this.f45771u = message;
            this.f45772v = drawable;
        } else {
            if (i10 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f45766p = charSequence;
            this.f45767q = message;
            this.f45768r = drawable;
        }
    }

    public void l(View view) {
        this.f45738G = view;
    }

    public void n(Drawable drawable) {
        this.f45734C = drawable;
        this.f45733B = 0;
        ImageView imageView = this.f45735D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f45735D.setImageDrawable(drawable);
            }
        }
    }

    public void o(CharSequence charSequence) {
        this.f45756f = charSequence;
        TextView textView = this.f45737F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void q(CharSequence charSequence) {
        this.f45755e = charSequence;
        TextView textView = this.f45736E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void s(View view) {
        this.f45758h = view;
        this.f45759i = 0;
        this.f45764n = false;
    }

    public void t(View view, int i10, int i11, int i12, int i13) {
        this.f45758h = view;
        this.f45759i = 0;
        this.f45764n = true;
        this.f45760j = i10;
        this.f45761k = i11;
        this.f45762l = i12;
        this.f45763m = i13;
    }

    public AlertController(Context context, q qVar, Window window) {
        this.f45751a = context;
        this.f45752b = qVar;
        this.f45753c = window;
        this.f45749R = new c(qVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, C14584j.f136711F, C14575a.f136535n, 0);
        this.f45741J = typedArrayObtainStyledAttributes.getResourceId(C14584j.f136716G, 0);
        this.f45742K = typedArrayObtainStyledAttributes.getResourceId(C14584j.f136726I, 0);
        this.f45743L = typedArrayObtainStyledAttributes.getResourceId(C14584j.f136735K, 0);
        this.f45744M = typedArrayObtainStyledAttributes.getResourceId(C14584j.f136739L, 0);
        this.f45745N = typedArrayObtainStyledAttributes.getResourceId(C14584j.f136747N, 0);
        this.f45746O = typedArrayObtainStyledAttributes.getResourceId(C14584j.f136731J, 0);
        this.f45747P = typedArrayObtainStyledAttributes.getBoolean(C14584j.f136743M, true);
        this.f45754d = typedArrayObtainStyledAttributes.getDimensionPixelSize(C14584j.f136721H, 0);
        typedArrayObtainStyledAttributes.recycle();
        qVar.h(1);
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    private void u(ViewGroup viewGroup) {
        int i10;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.f45765o = button;
        button.setOnClickListener(this.f45750S);
        if (TextUtils.isEmpty(this.f45766p) && this.f45768r == null) {
            this.f45765o.setVisibility(8);
            i10 = 0;
        } else {
            this.f45765o.setText(this.f45766p);
            Drawable drawable = this.f45768r;
            if (drawable != null) {
                int i11 = this.f45754d;
                drawable.setBounds(0, 0, i11, i11);
                this.f45765o.setCompoundDrawables(this.f45768r, null, null, null);
            }
            this.f45765o.setVisibility(0);
            i10 = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.f45769s = button2;
        button2.setOnClickListener(this.f45750S);
        if (TextUtils.isEmpty(this.f45770t) && this.f45772v == null) {
            this.f45769s.setVisibility(8);
        } else {
            this.f45769s.setText(this.f45770t);
            Drawable drawable2 = this.f45772v;
            if (drawable2 != null) {
                int i12 = this.f45754d;
                drawable2.setBounds(0, 0, i12, i12);
                this.f45769s.setCompoundDrawables(this.f45772v, null, null, null);
            }
            this.f45769s.setVisibility(0);
            i10 |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.f45773w = button3;
        button3.setOnClickListener(this.f45750S);
        if (TextUtils.isEmpty(this.f45774x) && this.f45776z == null) {
            this.f45773w.setVisibility(8);
        } else {
            this.f45773w.setText(this.f45774x);
            Drawable drawable3 = this.f45776z;
            if (drawable3 != null) {
                int i13 = this.f45754d;
                drawable3.setBounds(0, 0, i13, i13);
                this.f45773w.setCompoundDrawables(this.f45776z, null, null, null);
            }
            this.f45773w.setVisibility(0);
            i10 |= 4;
        }
        if (z(this.f45751a)) {
            if (i10 == 1) {
                b(this.f45765o);
            } else if (i10 == 2) {
                b(this.f45769s);
            } else if (i10 == 4) {
                b(this.f45773w);
            }
        }
        if (i10 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    public void f() {
        this.f45752b.setContentView(j());
        y();
    }
}
