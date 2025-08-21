package com.meijer.mobile.core.design.widget.checkableimagebutton;

import Cj.f;
import Cj.p;
import Cj.q;
import Q0.C4644a;
import Q0.C4645b;
import Z1.b;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.autofill.AutofillManager;
import android.widget.CheckBox;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import q2.y;
import w2.AbstractC17821a;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u0000 T2\u00020\u00012\u00020\u0002:\u0003U65B'\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB1\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\fJ7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u0015\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0012JE\u0010\u001c\u001a\u00020\r26\u0010\u001b\u001a2\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\r0\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u0019H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010#J\u000f\u0010$\u001a\u00020\rH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0019H\u0016¢\u0006\u0004\b&\u0010#J\u0017\u0010(\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u0019H\u0016¢\u0006\u0004\b(\u0010\"J\u0017\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020\u0007H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0014¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\r2\u0006\u00100\u001a\u00020-H\u0014¢\u0006\u0004\b1\u00102J\u0015\u00104\u001a\u00020\r2\u0006\u00103\u001a\u00020\u0019¢\u0006\u0004\b4\u0010\"J\r\u00105\u001a\u00020\u0019¢\u0006\u0004\b5\u0010#R\u0018\u00108\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010:\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00107R*\u0010B\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b<\u0010=\u0012\u0004\bA\u0010%\u001a\u0004\b>\u0010?\"\u0004\b\u001c\u0010@R\u0016\u0010E\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010G\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010DR\u0016\u00103\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010DR\u0016\u0010J\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010DR(\u0010L\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\bK\u0010D\u0012\u0004\bN\u0010%\u001a\u0004\bL\u0010#\"\u0004\bM\u0010\"R\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u000f8FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\bO\u0010\u001f*\u0004\bP\u0010QR\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u000f8FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\bR\u0010\u001f*\u0004\bS\u0010Q¨\u0006V"}, d2 = {"Lcom/meijer/mobile/core/design/widget/checkableimagebutton/CheckableImageButton;", "Landroidx/appcompat/widget/AppCompatImageButton;", "Landroid/widget/Checkable;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "a", "", "textOff", "setTextOff", "(Ljava/lang/CharSequence;)V", "textOn", "setTextOn", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "buttonView", "", "isChecked", "listener", "setOnCheckedChangeListener", "(Lkotlin/jvm/functions/Function2;)V", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "checked", "setChecked", "(Z)V", "()Z", "toggle", "()V", "performClick", "pressed", "setPressed", "extraSpace", "", "onCreateDrawableState", "(I)[I", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "checkable", "setCheckable", "b", "d", "Ljava/lang/CharSequence;", "_textOff", "e", "_textOn", "Lcom/meijer/mobile/core/design/widget/checkableimagebutton/CheckableImageButton$c;", "f", "Lcom/meijer/mobile/core/design/widget/checkableimagebutton/CheckableImageButton$c;", "getOnCheckedChangeListener", "()Lcom/meijer/mobile/core/design/widget/checkableimagebutton/CheckableImageButton$c;", "(Lcom/meijer/mobile/core/design/widget/checkableimagebutton/CheckableImageButton$c;)V", "getOnCheckedChangeListener$annotations", "onCheckedChangeListener", "g", "Z", "isBroadcasting", "h", "_isChecked", "i", "j", "checkedFromResource", "k", "isPressable", "setPressable", "isPressable$annotations", "getTextOff", "getTextOff$delegate", "(Lcom/meijer/mobile/core/design/widget/checkableimagebutton/CheckableImageButton;)Ljava/lang/Object;", "getTextOn", "getTextOn$delegate", "l", "c", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: m, reason: collision with root package name */
    public static final int f96868m = 8;

    /* renamed from: n, reason: collision with root package name */
    private static final int[] f96869n = {R.attr.state_checked};

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private CharSequence _textOff;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private CharSequence _textOn;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private c onCheckedChangeListener;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isBroadcasting;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean _isChecked;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean checkable;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean checkedFromResource;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean isPressable;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\b¨\u0006\u000e"}, d2 = {"com/meijer/mobile/core/design/widget/checkableimagebutton/CheckableImageButton$a", "Landroidx/core/view/a;", "Landroid/view/View;", "host", "Landroid/view/accessibility/AccessibilityEvent;", "event", "", "f", "(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V", "Lq2/y;", "info", "g", "(Landroid/view/View;Lq2/y;)V", "h", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void f(View host, AccessibilityEvent event) {
            Intrinsics.j(host, "host");
            Intrinsics.j(event, "event");
            super.f(host, event);
            event.setChecked(CheckableImageButton.this.isChecked());
            event.setClassName(CheckableImageButton.this.getAccessibilityClassName());
        }

        @Override // androidx.core.view.a
        public void g(View host, y info) {
            Intrinsics.j(host, "host");
            Intrinsics.j(info, "info");
            super.g(host, info);
            info.n0(CheckableImageButton.this.getCheckable());
            info.o0(CheckableImageButton.this.isChecked());
            info.p0(CheckableImageButton.this.getAccessibilityClassName());
            CharSequence charSequence = CheckableImageButton.this.isChecked() ? CheckableImageButton.this.get_textOn() : CheckableImageButton.this.get_textOff();
            if (charSequence == null || StringsKt.s0(charSequence)) {
                return;
            }
            CharSequence charSequenceC = info.C();
            if (charSequenceC == null || StringsKt.s0(charSequenceC)) {
                info.X0(charSequence);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(charSequenceC);
            sb2.append(' ');
            sb2.append(charSequence);
            info.X0(sb2);
        }

        @Override // androidx.core.view.a
        public void h(View host, AccessibilityEvent event) {
            Intrinsics.j(host, "host");
            Intrinsics.j(event, "event");
            super.h(host, event);
            CharSequence charSequence = CheckableImageButton.this.isChecked() ? CheckableImageButton.this.get_textOn() : CheckableImageButton.this.get_textOff();
            if (charSequence != null) {
                event.getText().add(charSequence);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/meijer/mobile/core/design/widget/checkableimagebutton/CheckableImageButton$c;", "", "Lcom/meijer/mobile/core/design/widget/checkableimagebutton/CheckableImageButton;", "buttonView", "", "isChecked", "", "a", "(Lcom/meijer/mobile/core/design/widget/checkableimagebutton/CheckableImageButton;Z)V", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface c {
        void a(CheckableImageButton buttonView, boolean isChecked);
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00182\u00020\u0001:\u0001\u0016B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u001a\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/core/design/widget/checkableimagebutton/CheckableImageButton$d;", "Lw2/a;", "Landroid/os/Parcelable;", "superState", "<init>", "(Landroid/os/Parcelable;)V", "Landroid/os/Parcel;", "source", "Ljava/lang/ClassLoader;", "loader", "(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V", "in", "", "c", "(Landroid/os/Parcel;)V", "out", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "Z", "b", "()Z", "d", "(Z)V", "checked", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends AbstractC17821a {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean checked;

        /* renamed from: e, reason: collision with root package name */
        public static final int f96880e = 8;

        @JvmField
        public static final Parcelable.Creator<d> CREATOR = new a();

        @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"com/meijer/mobile/core/design/widget/checkableimagebutton/CheckableImageButton$d$a", "Landroid/os/Parcelable$ClassLoaderCreator;", "Lcom/meijer/mobile/core/design/widget/checkableimagebutton/CheckableImageButton$d;", "Landroid/os/Parcel;", "in", "Ljava/lang/ClassLoader;", "loader", "b", "(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Lcom/meijer/mobile/core/design/widget/checkableimagebutton/CheckableImageButton$d;", "a", "(Landroid/os/Parcel;)Lcom/meijer/mobile/core/design/widget/checkableimagebutton/CheckableImageButton$d;", "", "size", "", "c", "(I)[Lcom/meijer/mobile/core/design/widget/checkableimagebutton/CheckableImageButton$d;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Parcelable.ClassLoaderCreator<d> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel in2) {
                Intrinsics.j(in2, "in");
                return new d(in2, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel in2, ClassLoader loader) {
                Intrinsics.j(in2, "in");
                Intrinsics.j(loader, "loader");
                return new d(in2, loader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int size) {
                return new d[size];
            }

            a() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Parcelable parcelable) {
            super(parcelable);
            Intrinsics.g(parcelable);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Parcel source, ClassLoader classLoader) {
            super(source, classLoader);
            Intrinsics.j(source, "source");
            c(source);
        }

        /* renamed from: b, reason: from getter */
        public final boolean getChecked() {
            return this.checked;
        }

        public final void d(boolean z10) {
            this.checked = z10;
        }

        @Override // w2.AbstractC17821a, android.os.Parcelable
        public void writeToParcel(Parcel out, int flags) {
            Intrinsics.j(out, "out");
            super.writeToParcel(out, flags);
            out.writeInt(this.checked ? 1 : 0);
        }

        private final void c(Parcel in2) {
            boolean z10 = true;
            if (in2.readInt() != 1) {
                z10 = false;
            }
            this.checked = z10;
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/meijer/mobile/core/design/widget/checkableimagebutton/CheckableImageButton$e", "Lcom/meijer/mobile/core/design/widget/checkableimagebutton/CheckableImageButton$c;", "Lcom/meijer/mobile/core/design/widget/checkableimagebutton/CheckableImageButton;", "buttonView", "", "isChecked", "", "a", "(Lcom/meijer/mobile/core/design/widget/checkableimagebutton/CheckableImageButton;Z)V", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e implements c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<CheckableImageButton, Boolean, Unit> f96882a;

        /* JADX WARN: Multi-variable type inference failed */
        e(Function2<? super CheckableImageButton, ? super Boolean, Unit> function2) {
            this.f96882a = function2;
        }

        @Override // com.meijer.mobile.core.design.widget.checkableimagebutton.CheckableImageButton.c
        public void a(CheckableImageButton buttonView, boolean isChecked) {
            Intrinsics.j(buttonView, "buttonView");
            this.f96882a.invoke(buttonView, Boolean.valueOf(isChecked));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.j(context, "context");
    }

    public static /* synthetic */ void getOnCheckedChangeListener$annotations() {
    }

    public final void setOnCheckedChangeListener(c cVar) {
        this.onCheckedChangeListener = cVar;
    }

    public /* synthetic */ CheckableImageButton(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? f.f4648b : i10);
    }

    private final void a(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        int[] CheckableImageButton = q.f5155f;
        Intrinsics.i(CheckableImageButton, "CheckableImageButton");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, CheckableImageButton, defStyleAttr, defStyleRes);
        setChecked(typedArrayObtainStyledAttributes.getBoolean(q.f5157h, false));
        this.checkedFromResource = true;
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(q.f5156g, true));
        this._textOn = typedArrayObtainStyledAttributes.getText(q.f5158i);
        this._textOff = typedArrayObtainStyledAttributes.getText(q.f5159j);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: b, reason: from getter */
    public final boolean getCheckable() {
        return this.checkable;
    }

    @Override // android.widget.ImageButton, android.widget.ImageView, android.view.View
    public CharSequence getAccessibilityClassName() {
        String name = CheckBox.class.getName();
        Intrinsics.i(name, "getName(...)");
        return name;
    }

    public final c getOnCheckedChangeListener() {
        return this.onCheckedChangeListener;
    }

    /* renamed from: getTextOff, reason: from getter */
    public final CharSequence get_textOff() {
        return this._textOff;
    }

    /* renamed from: getTextOn, reason: from getter */
    public final CharSequence get_textOn() {
        return this._textOn;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this._isChecked;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int extraSpace) {
        if (!this._isChecked) {
            int[] iArrOnCreateDrawableState = super.onCreateDrawableState(extraSpace);
            Intrinsics.g(iArrOnCreateDrawableState);
            return iArrOnCreateDrawableState;
        }
        int[] iArr = f96869n;
        int[] iArrMergeDrawableStates = View.mergeDrawableStates(super.onCreateDrawableState(extraSpace + iArr.length), iArr);
        Intrinsics.g(iArrMergeDrawableStates);
        return iArrMergeDrawableStates;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        Intrinsics.j(state, "state");
        if (!(state instanceof d)) {
            super.onRestoreInstanceState(state);
            return;
        }
        d dVar = (d) state;
        super.onRestoreInstanceState(dVar.a());
        setChecked(dVar.getChecked());
    }

    public final void setCheckable(boolean checkable) {
        if (this.checkable != checkable) {
            this.checkable = checkable;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean checked) {
        if (this._isChecked != checked) {
            this.checkedFromResource = false;
            this._isChecked = checked;
            refreshDrawableState();
            sendAccessibilityEvent(RecyclerView.m.FLAG_MOVED);
            if (this.isBroadcasting) {
                return;
            }
            this.isBroadcasting = true;
            c cVar = this.onCheckedChangeListener;
            if (cVar != null) {
                cVar.a(this, checked);
            }
            if (Build.VERSION.SDK_INT >= 26) {
                Context context = getContext();
                Intrinsics.i(context, "getContext(...)");
                AutofillManager autofillManagerA = C4645b.a(b.j(context, C4644a.a()));
                if (autofillManagerA != null) {
                    autofillManagerA.notifyValueChanged(this);
                }
            }
            this.isBroadcasting = false;
        }
    }

    public final void setOnCheckedChangeListener(Function2<? super CheckableImageButton, ? super Boolean, Unit> listener) {
        Intrinsics.j(listener, "listener");
        this.onCheckedChangeListener = new e(listener);
    }

    public final void setPressable(boolean z10) {
        this.isPressable = z10;
    }

    @Override // android.view.View
    public void setPressed(boolean pressed) {
        if (this.isPressable) {
            super.setPressed(pressed);
        }
    }

    public final void setTextOff(CharSequence textOff) {
        Intrinsics.j(textOff, "textOff");
        this._textOff = textOff;
        requestLayout();
    }

    public final void setTextOn(CharSequence textOn) {
        Intrinsics.j(textOn, "textOn");
        this._textOn = textOn;
        requestLayout();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this._isChecked);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.d(this._isChecked);
        return dVar;
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        boolean zPerformClick = super.performClick();
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        return zPerformClick;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CheckableImageButton(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, p.f5115n);
        Intrinsics.j(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckableImageButton(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10);
        Intrinsics.j(context, "context");
        this.checkable = true;
        this.isPressable = true;
        ViewCompat.m0(this, new a());
        a(context, attributeSet, i10, i11);
    }
}
