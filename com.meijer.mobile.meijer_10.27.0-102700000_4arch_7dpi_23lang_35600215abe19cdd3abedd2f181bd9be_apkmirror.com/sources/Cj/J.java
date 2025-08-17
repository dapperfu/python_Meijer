package Cj;

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
import g6.C14209i;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import ou.AbstractC16177a;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LCj/J;", "Lou/a;", "LNj/i;", "<init>", "()V", "binding", "", "position", "", "J", "(LNj/i;I)V", "j", "()I", "Landroid/view/View;", "view", "T", "(Landroid/view/View;)LNj/i;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class J extends AbstractC16177a<Nj.i> {

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Cj/J$a", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "", "afterTextChanged", "(Landroid/text/Editable;)V", "", "text", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a implements TextWatcher {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Nj.i f4243a;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence text, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence text, int start, int before, int count) {
        }

        public a(Nj.i iVar) {
            this.f4243a = iVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s10) {
            String string;
            if (s10 == null || (string = s10.toString()) == null || string.length() <= 0 || Float.parseFloat(string) >= this.f4243a.f22121c.f22076c.getMaxFrame()) {
                return;
            }
            this.f4243a.f22121c.f22076c.setMinFrame(Integer.parseInt(s10.toString()));
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Cj/J$b", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "", "afterTextChanged", "(Landroid/text/Editable;)V", "", "text", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class b implements TextWatcher {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Nj.i f4244a;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence text, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence text, int start, int before, int count) {
        }

        public b(Nj.i iVar) {
            this.f4244a = iVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s10) {
            String string;
            if (s10 == null || (string = s10.toString()) == null || string.length() <= 0 || Float.parseFloat(string) <= this.f4244a.f22121c.f22076c.getMinFrame()) {
                return;
            }
            this.f4244a.f22121c.f22076c.setMaxFrame(MathKt.d(Float.parseFloat(string)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(Nj.i iVar, View view) {
        iVar.f22121c.f22076c.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(Nj.i iVar, CompoundButton compoundButton, boolean z10) {
        if (!z10) {
            iVar.f22121c.f22076c.setRepeatCount(0);
        } else {
            iVar.f22121c.f22076c.setRepeatCount(-1);
            iVar.f22121c.f22076c.w();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(Nj.i iVar, Slider slider, float f10, boolean z10) {
        Intrinsics.j(slider, "<unused var>");
        iVar.f22121c.f22076c.setSpeed(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(Nj.i iVar, CompoundButton compoundButton, boolean z10) {
        View root = iVar.f22121c.f22075b.getRoot();
        Intrinsics.i(root, "getRoot(...)");
        root.setVisibility(z10 ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(Nj.i iVar, CompoundButton compoundButton, boolean z10) {
        MaterialButton playButton = iVar.f22121c.f22079f;
        Intrinsics.i(playButton, "playButton");
        playButton.setVisibility(z10 ? 0 : 8);
        CheckBox loopCheckbox = iVar.f22121c.f22078e;
        Intrinsics.i(loopCheckbox, "loopCheckbox");
        loopCheckbox.setVisibility(z10 ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(Nj.i iVar, CompoundButton compoundButton, boolean z10) {
        Slider speedSlider = iVar.f22121c.f22084k;
        Intrinsics.i(speedSlider, "speedSlider");
        speedSlider.setVisibility(z10 ? 0 : 8);
    }

    @Override // ou.AbstractC16177a
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public void u(final Nj.i binding, int position) throws Resources.NotFoundException {
        Intrinsics.j(binding, "binding");
        Nj.l lVar = binding.f22122d;
        ProgressIndicatorView progressIndicatorView = lVar.f22128b;
        String[] stringArray = lVar.getRoot().getContext().getResources().getStringArray(Bj.e.f2596a);
        Intrinsics.i(stringArray, "getStringArray(...)");
        progressIndicatorView.d(ArraysKt.i1(stringArray), 1);
        ProgressIndicatorView progressIndicatorView2 = lVar.f22129c;
        String[] stringArray2 = lVar.getRoot().getContext().getResources().getStringArray(Bj.e.f2597b);
        Intrinsics.i(stringArray2, "getStringArray(...)");
        progressIndicatorView2.d(ArraysKt.i1(stringArray2), 2);
        binding.f22121c.f22076c.setSpeed(1.0f);
        binding.f22121c.f22079f.setOnClickListener(new View.OnClickListener() { // from class: Cj.A
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                J.K(binding, view);
            }
        });
        binding.f22121c.f22076c.l(new g6.C() { // from class: Cj.B
            @Override // g6.C
            public final void a(C14209i c14209i) {
                J.P(binding, c14209i);
            }
        });
        binding.f22121c.f22085l.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: Cj.C
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                J.Q(binding, compoundButton, z10);
            }
        });
        binding.f22121c.f22076c.setAnimation(Bj.n.f2959c);
        TextInputEditText minFrameEditText = binding.f22121c.f22075b.f22169B;
        Intrinsics.i(minFrameEditText, "minFrameEditText");
        minFrameEditText.addTextChangedListener(new a(binding));
        TextInputEditText maxFrameEditText = binding.f22121c.f22075b.f22171z;
        Intrinsics.i(maxFrameEditText, "maxFrameEditText");
        maxFrameEditText.addTextChangedListener(new b(binding));
        binding.f22121c.f22080g.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: Cj.D
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                J.R(binding, compoundButton, z10);
            }
        });
        binding.f22121c.f22083j.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: Cj.E
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                J.S(binding, compoundButton, z10);
            }
        });
        binding.f22121c.f22078e.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: Cj.F
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                J.L(binding, compoundButton, z10);
            }
        });
        binding.f22121c.f22084k.h(new com.google.android.material.slider.a() { // from class: Cj.G
            @Override // com.google.android.material.slider.a
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void a(Slider slider, float f10, boolean z10) {
                J.M(binding, slider, f10, z10);
            }
        });
        binding.f22120b.f22087b.getActionButton().setOnClickListener(new View.OnClickListener() { // from class: Cj.H
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                J.N(binding, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ou.AbstractC16177a
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public Nj.i z(View view) {
        Intrinsics.j(view, "view");
        Nj.i iVarA = Nj.i.a(view);
        Intrinsics.i(iVarA, "bind(...)");
        return iVarA;
    }

    @Override // nu.h
    /* renamed from: j */
    public int getLayoutId() {
        return Bj.m.f2942l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(Nj.i iVar, View view) {
        final Snackbar snackbarR0 = Snackbar.r0(iVar.getRoot(), "Applied Promo Code Action Button", 0);
        snackbarR0.u0("Dismiss", new View.OnClickListener() { // from class: Cj.I
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
    public static final void P(Nj.i iVar, C14209i c14209i) {
        iVar.f22121c.f22075b.f22168A.setText(String.valueOf(MathKt.d(c14209i.f())));
    }
}
