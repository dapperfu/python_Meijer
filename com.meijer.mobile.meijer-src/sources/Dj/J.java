package Dj;

import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.slider.Slider;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;
import com.meijer.mobile.core.design.widget.checkoutprogressstepperview.ProgressIndicatorView;
import h6.C14478i;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import ku.AbstractC15424a;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LDj/J;", "Lku/a;", "LOj/i;", "<init>", "()V", "binding", "", "position", "", "J", "(LOj/i;I)V", "j", "()I", "Landroid/view/View;", "view", "T", "(Landroid/view/View;)LOj/i;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class J extends AbstractC15424a<Oj.i> {

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Dj/J$a", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "", "afterTextChanged", "(Landroid/text/Editable;)V", "", "text", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a implements TextWatcher {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Oj.i f6295a;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence text, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence text, int start, int before, int count) {
        }

        public a(Oj.i iVar) {
            this.f6295a = iVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s10) {
            String string;
            if (s10 == null || (string = s10.toString()) == null || string.length() <= 0 || Float.parseFloat(string) >= this.f6295a.f24366c.f24321c.getMaxFrame()) {
                return;
            }
            this.f6295a.f24366c.f24321c.setMinFrame(Integer.parseInt(s10.toString()));
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Dj/J$b", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "", "afterTextChanged", "(Landroid/text/Editable;)V", "", "text", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class b implements TextWatcher {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Oj.i f6296a;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence text, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence text, int start, int before, int count) {
        }

        public b(Oj.i iVar) {
            this.f6296a = iVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s10) {
            String string;
            if (s10 == null || (string = s10.toString()) == null || string.length() <= 0 || Float.parseFloat(string) <= this.f6296a.f24366c.f24321c.getMinFrame()) {
                return;
            }
            this.f6296a.f24366c.f24321c.setMaxFrame(MathKt.d(Float.parseFloat(string)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(Oj.i iVar, View view) {
        iVar.f24366c.f24321c.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(Oj.i iVar, CompoundButton compoundButton, boolean z10) {
        if (!z10) {
            iVar.f24366c.f24321c.setRepeatCount(0);
        } else {
            iVar.f24366c.f24321c.setRepeatCount(-1);
            iVar.f24366c.f24321c.w();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(Oj.i iVar, Slider slider, float f10, boolean z10) {
        Intrinsics.j(slider, "<unused var>");
        iVar.f24366c.f24321c.setSpeed(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(Oj.i iVar, CompoundButton compoundButton, boolean z10) {
        View root = iVar.f24366c.f24320b.getRoot();
        Intrinsics.i(root, "getRoot(...)");
        root.setVisibility(z10 ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(Oj.i iVar, CompoundButton compoundButton, boolean z10) {
        MaterialButton playButton = iVar.f24366c.f24324f;
        Intrinsics.i(playButton, "playButton");
        playButton.setVisibility(z10 ? 0 : 8);
        CheckBox loopCheckbox = iVar.f24366c.f24323e;
        Intrinsics.i(loopCheckbox, "loopCheckbox");
        loopCheckbox.setVisibility(z10 ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(Oj.i iVar, CompoundButton compoundButton, boolean z10) {
        Slider speedSlider = iVar.f24366c.f24329k;
        Intrinsics.i(speedSlider, "speedSlider");
        speedSlider.setVisibility(z10 ? 0 : 8);
    }

    @Override // ku.AbstractC15424a
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public void u(final Oj.i binding, int position) throws Resources.NotFoundException {
        Intrinsics.j(binding, "binding");
        Oj.l lVar = binding.f24367d;
        ProgressIndicatorView progressIndicatorView = lVar.f24373b;
        String[] stringArray = lVar.getRoot().getContext().getResources().getStringArray(Cj.e.f4641a);
        Intrinsics.i(stringArray, "getStringArray(...)");
        progressIndicatorView.d(ArraysKt.h1(stringArray), 1);
        ProgressIndicatorView progressIndicatorView2 = lVar.f24374c;
        String[] stringArray2 = lVar.getRoot().getContext().getResources().getStringArray(Cj.e.f4642b);
        Intrinsics.i(stringArray2, "getStringArray(...)");
        progressIndicatorView2.d(ArraysKt.h1(stringArray2), 2);
        binding.f24366c.f24321c.setSpeed(1.0f);
        binding.f24366c.f24324f.setOnClickListener(new View.OnClickListener() { // from class: Dj.A
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                J.K(binding, view);
            }
        });
        binding.f24366c.f24321c.l(new h6.C() { // from class: Dj.B
            @Override // h6.C
            public final void a(C14478i c14478i) {
                J.P(binding, c14478i);
            }
        });
        binding.f24366c.f24330l.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: Dj.C
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                J.Q(binding, compoundButton, z10);
            }
        });
        binding.f24366c.f24321c.setAnimation(Cj.n.f5004c);
        TextInputEditText minFrameEditText = binding.f24366c.f24320b.f24414B;
        Intrinsics.i(minFrameEditText, "minFrameEditText");
        minFrameEditText.addTextChangedListener(new a(binding));
        TextInputEditText maxFrameEditText = binding.f24366c.f24320b.f24416z;
        Intrinsics.i(maxFrameEditText, "maxFrameEditText");
        maxFrameEditText.addTextChangedListener(new b(binding));
        binding.f24366c.f24325g.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: Dj.D
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                J.R(binding, compoundButton, z10);
            }
        });
        binding.f24366c.f24328j.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: Dj.E
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                J.S(binding, compoundButton, z10);
            }
        });
        binding.f24366c.f24323e.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: Dj.F
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                J.L(binding, compoundButton, z10);
            }
        });
        binding.f24366c.f24329k.h(new com.google.android.material.slider.a() { // from class: Dj.G
            @Override // com.google.android.material.slider.a
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void a(Slider slider, float f10, boolean z10) {
                J.M(binding, slider, f10, z10);
            }
        });
        binding.f24365b.f24332b.getActionButton().setOnClickListener(new View.OnClickListener() { // from class: Dj.H
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                J.N(binding, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ku.AbstractC15424a
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public Oj.i z(View view) {
        Intrinsics.j(view, "view");
        Oj.i iVarA = Oj.i.a(view);
        Intrinsics.i(iVarA, "bind(...)");
        return iVarA;
    }

    @Override // ju.h
    /* renamed from: j */
    public int getLayoutId() {
        return Cj.m.f4987l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(Oj.i iVar, View view) {
        final Snackbar snackbarR0 = Snackbar.r0(iVar.getRoot(), "Applied Promo Code Action Button", 0);
        snackbarR0.u0("Dismiss", new View.OnClickListener() { // from class: Dj.I
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                J.O(snackbarR0, view2);
            }
        });
        snackbarR0.c0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(Snackbar snackbar, View view) {
        snackbar.A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(Oj.i iVar, C14478i c14478i) {
        iVar.f24366c.f24320b.f24413A.setText(String.valueOf(MathKt.d(c14478i.f())));
    }
}
