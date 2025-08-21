package com.meijer.mobile.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import ce.C6503b;
import com.meijer.mobile.meijer.a0;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/widget/DebouncingAutoCompleteTextView;", "Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "text", "keyCode", "", "performFiltering", "(Ljava/lang/CharSequence;I)V", "", "e", "J", "suggestionDelayMillis", "Ljava/util/Timer;", "f", "Ljava/util/Timer;", "timer", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public class DebouncingAutoCompleteTextView extends AppCompatAutoCompleteTextView {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long suggestionDelayMillis;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Timer timer;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/meijer/mobile/widget/DebouncingAutoCompleteTextView$a", "Ljava/util/TimerTask;", "", "run", "()V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends TimerTask {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CharSequence f120471b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f120472c;

        a(CharSequence charSequence, int i10) {
            this.f120471b = charSequence;
            this.f120472c = i10;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            DebouncingAutoCompleteTextView.super.performFiltering(this.f120471b, this.f120472c);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DebouncingAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.j(context, "context");
    }

    public /* synthetic */ DebouncingAutoCompleteTextView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? C6503b.f61524c : i10);
    }

    @Override // android.widget.AutoCompleteTextView
    protected void performFiltering(CharSequence text, int keyCode) {
        this.timer.cancel();
        Timer timer = new Timer();
        this.timer = timer;
        timer.schedule(new a(text, keyCode), this.suggestionDelayMillis);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DebouncingAutoCompleteTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.j(context, "context");
        this.timer = new Timer();
        int[] DebouncingAutoCompleteTextView = a0.f101796h;
        Intrinsics.i(DebouncingAutoCompleteTextView, "DebouncingAutoCompleteTextView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DebouncingAutoCompleteTextView, i10, 0);
        this.suggestionDelayMillis = typedArrayObtainStyledAttributes.getInt(a0.f101797i, HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES);
        typedArrayObtainStyledAttributes.recycle();
    }
}
