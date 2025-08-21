package com.meijer.mobile.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.meijer.mobile.meijer.a0;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u00012B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0019\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010 R\u0018\u0010&\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R$\u0010,\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00063"}, d2 = {"Lcom/meijer/mobile/widget/SpannableTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "msgText", "", "msgId", "clickableTextId", "", "v", "(Ljava/lang/String;II)V", "Landroid/text/SpannableStringBuilder;", "spannableStringBuilder", "u", "(Landroid/text/SpannableStringBuilder;)V", "onAttachedToWindow", "()V", "Landroid/graphics/Typeface;", "typeface", "style", "setTypeface", "(Landroid/graphics/Typeface;I)V", "Landroid/text/Spannable;", "spannableText", "setSpannableText", "(Landroid/text/Spannable;)V", "h", "I", "textTypeface", "i", "clickableTextTypeface", "j", "Ljava/lang/String;", "clickableText", "", "k", "Z", "underlineClickableText", "Lcom/meijer/mobile/widget/SpannableTextView$a;", "listener", "Lcom/meijer/mobile/widget/SpannableTextView$a;", "getListener", "()Lcom/meijer/mobile/widget/SpannableTextView$a;", "setListener", "(Lcom/meijer/mobile/widget/SpannableTextView$a;)V", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class SpannableTextView extends AppCompatTextView {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int textTypeface;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int clickableTextTypeface;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private String clickableText;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean underlineClickableText;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/meijer/mobile/widget/SpannableTextView$a;", "", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/meijer/mobile/widget/SpannableTextView$b", "Landroid/text/style/UnderlineSpan;", "Landroid/text/TextPaint;", "tp", "", "updateDrawState", "(Landroid/text/TextPaint;)V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends UnderlineSpan {
        b() {
        }

        @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint tp2) {
            Intrinsics.j(tp2, "tp");
            tp2.setUnderlineText(SpannableTextView.this.underlineClickableText);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/meijer/mobile/widget/SpannableTextView$c", "Landroid/text/style/ClickableSpan;", "Landroid/view/View;", "widget", "", "onClick", "(Landroid/view/View;)V", "Landroid/text/TextPaint;", "ds", "updateDrawState", "(Landroid/text/TextPaint;)V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends ClickableSpan {
        c() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.j(widget, "widget");
            SpannableTextView.this.getListener();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.j(ds2, "ds");
            super.updateDrawState(ds2);
            ds2.setUnderlineText(SpannableTextView.this.underlineClickableText);
        }
    }

    public final a getListener() {
        return null;
    }

    public final void setListener(a aVar) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpannableTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.j(context, "context");
        int[] SpannableTextView = a0.f101809u;
        Intrinsics.i(SpannableTextView, "SpannableTextView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, SpannableTextView, 0, 0);
        this.clickableText = typedArrayObtainStyledAttributes.getString(a0.f101810v);
        this.clickableTextTypeface = typedArrayObtainStyledAttributes.getInt(a0.f101811w, 0);
        this.underlineClickableText = typedArrayObtainStyledAttributes.getBoolean(a0.f101812x, true);
        v(getText().toString(), 0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void v(String msgText, int msgId, int clickableTextId) {
        if (msgText == null) {
            msgText = msgId != 0 ? getContext().getString(msgId) : null;
        }
        if (clickableTextId != 0) {
            this.clickableText = getContext().getString(clickableTextId);
        }
        String str = this.clickableText;
        if (str == null || StringsKt.s0(str) || msgText == null || StringsKt.s0(msgText)) {
            return;
        }
        Locale locale = Locale.getDefault();
        Intrinsics.i(locale, "getDefault(...)");
        String lowerCase = msgText.toLowerCase(locale);
        Intrinsics.i(lowerCase, "toLowerCase(...)");
        String str2 = this.clickableText;
        Intrinsics.g(str2);
        Locale locale2 = Locale.getDefault();
        Intrinsics.i(locale2, "getDefault(...)");
        String lowerCase2 = str2.toLowerCase(locale2);
        Intrinsics.i(lowerCase2, "toLowerCase(...)");
        int iQ0 = StringsKt.q0(lowerCase, lowerCase2, 0, false, 6, null);
        if (iQ0 < 0) {
            setText(msgText);
            return;
        }
        String str3 = this.clickableText;
        Intrinsics.g(str3);
        int length = str3.length() + iQ0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(msgText);
        spannableStringBuilder.setSpan(new StyleSpan(this.textTypeface), 0, iQ0 - 1, 33);
        spannableStringBuilder.setSpan(new StyleSpan(this.clickableTextTypeface), iQ0, length, 33);
        spannableStringBuilder.setSpan(new c(), iQ0, length, 33);
        u(spannableStringBuilder);
        setMovementMethod(LinkMovementMethod.getInstance());
    }

    public final void setSpannableText(Spannable spannableText) {
        URLSpan[] uRLSpanArr;
        if (spannableText != null && (uRLSpanArr = (URLSpan[]) spannableText.getSpans(0, spannableText.length(), URLSpan.class)) != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                spannableText.setSpan(new b(), spannableText.getSpanStart(uRLSpan), spannableText.getSpanEnd(uRLSpan), 0);
            }
        }
        setText(spannableText);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTypeface(Typeface typeface, int style) {
        this.textTypeface = style;
    }

    private final void u(SpannableStringBuilder spannableStringBuilder) {
        setText(spannableStringBuilder);
        setHighlightColor(0);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.clickableText;
        if (str != null && !StringsKt.s0(str)) {
            v(getText().toString(), 0, 0);
        }
    }
}
