package com.meijer.mobile.core.base.ui.textview;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.fullstory.FS;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 [2\u00020\u0001:\u0007\\]^_`abB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001e\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010$\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006H\u0014¢\u0006\u0004\b$\u0010%J/\u0010*\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0006H\u0016¢\u0006\u0004\b*\u0010%J\u0017\u0010-\u001a\u00020\n2\u0006\u0010,\u001a\u00020+H\u0014¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0006H\u0016¢\u0006\u0004\b/\u0010\u000eJ\u0019\u00102\u001a\u00020\n2\b\u00101\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b2\u00103J\u0019\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u00010\u001aH\u0000¢\u0006\u0004\b6\u00107R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u000209088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010:R\u001c\u0010?\u001a\b\u0018\u00010<R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010B\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010D\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010AR\u0016\u0010F\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010AR\u0018\u0010I\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010\u000f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010N\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010P\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010MR\u0016\u0010R\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010AR$\u0010Z\u001a\u0004\u0018\u00010S8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010Y¨\u0006c"}, d2 = {"Lcom/meijer/mobile/core/base/ui/textview/FullWordEllipsisTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "z", "()V", "getMaxLines", "()I", "maxLines", "setMaxLines", "(I)V", "", "y", "()Z", "", "add", "mult", "setLineSpacing", "(FF)V", "", "text", "Landroid/widget/TextView$BufferType;", "type", "setText", "(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "left", "top", "right", "bottom", "setPadding", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "getLineCount", "Landroid/text/TextUtils$TruncateAt;", "where", "setEllipsize", "(Landroid/text/TextUtils$TruncateAt;)V", "workingText", "Landroid/text/Layout;", "x", "(Ljava/lang/CharSequence;)Landroid/text/Layout;", "", "Lcom/meijer/mobile/core/base/ui/textview/FullWordEllipsisTextView$c;", "Ljava/util/List;", "ellipsizeListeners", "Lcom/meijer/mobile/core/base/ui/textview/FullWordEllipsisTextView$g;", "i", "Lcom/meijer/mobile/core/base/ui/textview/FullWordEllipsisTextView$g;", "ellipsizeStrategy", "j", "Z", "isEllipsized", "k", "isStale", "l", "programmaticChange", "m", "Ljava/lang/CharSequence;", "fullText", "n", "I", "o", "F", "lineSpacingMult", "p", "lineAddVertPad", "q", "textContainsBoldStyle", "Ljava/util/regex/Pattern;", "r", "Ljava/util/regex/Pattern;", "getEndPunctuationPattern", "()Ljava/util/regex/Pattern;", "setEndPunctuationPattern", "(Ljava/util/regex/Pattern;)V", "endPunctuationPattern", "s", "c", "g", "e", "b", "f", "d", "a", "base-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class FullWordEllipsisTextView extends AppCompatTextView {

    /* renamed from: t, reason: collision with root package name */
    private static final CharSequence f95971t = "…";

    /* renamed from: u, reason: collision with root package name */
    private static final Pattern f95972u;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List<c> ellipsizeListeners;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private g ellipsizeStrategy;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean isEllipsized;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean isStale;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private boolean programmaticChange;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private CharSequence fullText;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int maxLines;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private float lineSpacingMult;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private float lineAddVertPad;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean textContainsBoldStyle;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private Pattern endPunctuationPattern;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/meijer/mobile/core/base/ui/textview/FullWordEllipsisTextView$b;", "Lcom/meijer/mobile/core/base/ui/textview/FullWordEllipsisTextView$g;", "Lcom/meijer/mobile/core/base/ui/textview/FullWordEllipsisTextView;", "<init>", "(Lcom/meijer/mobile/core/base/ui/textview/FullWordEllipsisTextView;)V", "", "fullText", "b", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "workingText", "", "g", "(Ljava/lang/CharSequence;)Ljava/lang/String;", "base-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class b extends g {
        public b() {
            super();
        }

        @Override // com.meijer.mobile.core.base.ui.textview.FullWordEllipsisTextView.g
        protected CharSequence b(CharSequence fullText) {
            int iV0;
            int lineEnd = FullWordEllipsisTextView.this.x(fullText).getLineEnd(FullWordEllipsisTextView.this.maxLines - 1);
            Intrinsics.g(fullText);
            int length = fullText.length();
            int length2 = length - lineEnd;
            if (length2 < FullWordEllipsisTextView.f95971t.length()) {
                length2 = FullWordEllipsisTextView.f95971t.length();
            }
            String strSubstring = TextUtils.substring(fullText, 0, length - length2);
            Intrinsics.i(strSubstring, "substring(...)");
            String string = StringsKt.y1(strSubstring).toString();
            String strG = g(string);
            String string2 = string;
            while (true) {
                if (e(strG + ((Object) FullWordEllipsisTextView.f95971t)) || (iV0 = StringsKt.v0(string2, ' ', 0, false, 6, null)) == -1) {
                    break;
                }
                String strSubstring2 = string2.substring(0, iV0);
                Intrinsics.i(strSubstring2, "substring(...)");
                string2 = StringsKt.y1(strSubstring2).toString();
                strG = g(string2);
            }
            String str = strG + ((Object) FullWordEllipsisTextView.f95971t);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            if (fullText instanceof Spanned) {
                TextUtils.copySpansFrom((Spanned) fullText, 0, str.length(), null, spannableStringBuilder, 0);
            }
            return spannableStringBuilder;
        }

        public final String g(CharSequence workingText) {
            Intrinsics.j(workingText, "workingText");
            Pattern endPunctuationPattern = FullWordEllipsisTextView.this.getEndPunctuationPattern();
            Intrinsics.g(endPunctuationPattern);
            String strReplaceFirst = endPunctuationPattern.matcher(workingText).replaceFirst("");
            Intrinsics.i(strReplaceFirst, "replaceFirst(...)");
            return strReplaceFirst;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/meijer/mobile/core/base/ui/textview/FullWordEllipsisTextView$c;", "", "", "ellipsized", "", "a", "(Z)V", "base-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface c {
        void a(boolean ellipsized);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/meijer/mobile/core/base/ui/textview/FullWordEllipsisTextView$d;", "Lcom/meijer/mobile/core/base/ui/textview/FullWordEllipsisTextView$g;", "Lcom/meijer/mobile/core/base/ui/textview/FullWordEllipsisTextView;", "<init>", "(Lcom/meijer/mobile/core/base/ui/textview/FullWordEllipsisTextView;)V", "", "fullText", "b", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "base-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class d extends g {
        public d() {
            super();
        }

        @Override // com.meijer.mobile.core.base.ui.textview.FullWordEllipsisTextView.g
        protected CharSequence b(CharSequence fullText) {
            String str;
            SpannableStringBuilder spannableStringBuilder;
            int lineEnd = FullWordEllipsisTextView.this.x(fullText).getLineEnd(FullWordEllipsisTextView.this.maxLines - 1);
            Intrinsics.g(fullText);
            int length = fullText.length();
            int length2 = length - lineEnd;
            if (length2 < FullWordEllipsisTextView.f95971t.length()) {
                length2 = FullWordEllipsisTextView.f95971t.length();
            }
            int i10 = length2 + (lineEnd % 2);
            int i11 = length / 2;
            int i12 = i10 / 2;
            String strSubstring = TextUtils.substring(fullText, 0, i11 - i12);
            Intrinsics.i(strSubstring, "substring(...)");
            String string = StringsKt.y1(strSubstring).toString();
            String strSubstring2 = TextUtils.substring(fullText, i11 + i12, length);
            Intrinsics.i(strSubstring2, "substring(...)");
            String string2 = StringsKt.y1(strSubstring2).toString();
            String string3 = string;
            while (true) {
                if (e(string3 + ((Object) FullWordEllipsisTextView.f95971t) + string2)) {
                    str = string3;
                    break;
                }
                int iV0 = StringsKt.v0(string3, ' ', 0, false, 6, null);
                str = string3;
                int iO0 = StringsKt.o0(string2, ' ', 0, false, 6, null);
                if (iV0 == -1 || iO0 == -1) {
                    break;
                }
                String strSubstring3 = str.substring(0, iV0);
                Intrinsics.i(strSubstring3, "substring(...)");
                string3 = StringsKt.y1(strSubstring3).toString();
                String strSubstring4 = string2.substring(iO0);
                Intrinsics.i(strSubstring4, "substring(...)");
                string2 = StringsKt.y1(strSubstring4).toString();
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(string2);
            if (fullText instanceof Spanned) {
                Spanned spanned = (Spanned) fullText;
                spannableStringBuilder = spannableStringBuilder2;
                TextUtils.copySpansFrom(spanned, 0, str.length(), null, spannableStringBuilder, 0);
                TextUtils.copySpansFrom(spanned, length - string2.length(), length, null, spannableStringBuilder3, 0);
            } else {
                spannableStringBuilder = spannableStringBuilder2;
            }
            return TextUtils.concat(spannableStringBuilder, FullWordEllipsisTextView.f95971t, spannableStringBuilder3);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/meijer/mobile/core/base/ui/textview/FullWordEllipsisTextView$e;", "Lcom/meijer/mobile/core/base/ui/textview/FullWordEllipsisTextView$g;", "Lcom/meijer/mobile/core/base/ui/textview/FullWordEllipsisTextView;", "<init>", "(Lcom/meijer/mobile/core/base/ui/textview/FullWordEllipsisTextView;)V", "", "fullText", "b", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "base-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class e extends g {
        @Override // com.meijer.mobile.core.base.ui.textview.FullWordEllipsisTextView.g
        protected CharSequence b(CharSequence fullText) {
            return fullText;
        }

        public e() {
            super();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/meijer/mobile/core/base/ui/textview/FullWordEllipsisTextView$f;", "Lcom/meijer/mobile/core/base/ui/textview/FullWordEllipsisTextView$g;", "Lcom/meijer/mobile/core/base/ui/textview/FullWordEllipsisTextView;", "<init>", "(Lcom/meijer/mobile/core/base/ui/textview/FullWordEllipsisTextView;)V", "", "fullText", "b", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "base-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class f extends g {
        public f() {
            super();
        }

        @Override // com.meijer.mobile.core.base.ui.textview.FullWordEllipsisTextView.g
        protected CharSequence b(CharSequence fullText) {
            int iO0;
            int lineEnd = FullWordEllipsisTextView.this.x(fullText).getLineEnd(FullWordEllipsisTextView.this.maxLines - 1);
            Intrinsics.g(fullText);
            int length = fullText.length();
            int length2 = length - lineEnd;
            if (length2 < FullWordEllipsisTextView.f95971t.length()) {
                length2 = FullWordEllipsisTextView.f95971t.length();
            }
            String strSubstring = TextUtils.substring(fullText, length2, length);
            Intrinsics.i(strSubstring, "substring(...)");
            String string = StringsKt.y1(strSubstring).toString();
            while (true) {
                if (e(((Object) FullWordEllipsisTextView.f95971t) + string) || (iO0 = StringsKt.o0(string, ' ', 0, false, 6, null)) == -1) {
                    break;
                }
                String strSubstring2 = string.substring(iO0);
                Intrinsics.i(strSubstring2, "substring(...)");
                string = StringsKt.y1(strSubstring2).toString();
            }
            String str = ((Object) FullWordEllipsisTextView.f95971t) + string;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            if (fullText instanceof Spanned) {
                TextUtils.copySpansFrom((Spanned) fullText, length - str.length(), length, null, spannableStringBuilder, 0);
            }
            return spannableStringBuilder;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\b¢\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\bJ\u001b\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0004H$¢\u0006\u0004\b\r\u0010\nR\u0014\u0010\u0011\u001a\u00020\u000e8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/core/base/ui/textview/FullWordEllipsisTextView$g;", "", "<init>", "(Lcom/meijer/mobile/core/base/ui/textview/FullWordEllipsisTextView;)V", "", "text", "", "a", "(Ljava/lang/CharSequence;)Z", "f", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "e", "fullText", "b", "", "d", "()I", "linesCount", "c", "fullyVisibleLinesCount", "base-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    private abstract class g {
        protected abstract CharSequence b(CharSequence fullText);

        public g() {
        }

        private final boolean a(CharSequence text) {
            if (!(text instanceof Spanned)) {
                return false;
            }
            CharSequence charSequence = FullWordEllipsisTextView.this.fullText;
            Intrinsics.g(charSequence);
            StyleSpan[] styleSpanArr = (StyleSpan[]) ((Spanned) text).getSpans(0, charSequence.length(), StyleSpan.class);
            Intrinsics.g(styleSpanArr);
            for (StyleSpan styleSpan : styleSpanArr) {
                if (ArraysKt.Y(new Integer[]{1, 3}, Integer.valueOf(styleSpan.getStyle()))) {
                    return true;
                }
            }
            return false;
        }

        protected final int c() {
            return ((FullWordEllipsisTextView.this.getHeight() - FullWordEllipsisTextView.this.getCompoundPaddingTop()) - FullWordEllipsisTextView.this.getCompoundPaddingBottom()) / FullWordEllipsisTextView.this.x("").getLineBottom(0);
        }

        protected final int d() {
            if (!FullWordEllipsisTextView.this.y()) {
                return FullWordEllipsisTextView.this.maxLines;
            }
            int iC = c();
            if (iC == -1) {
                return 1;
            }
            return iC;
        }

        public final boolean e(CharSequence text) {
            return FullWordEllipsisTextView.this.x(text).getLineCount() <= d();
        }

        public final CharSequence f(CharSequence text) {
            FullWordEllipsisTextView.this.textContainsBoldStyle = a(text);
            return !e(text) ? b(text) : text;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class h {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextUtils.TruncateAt.values().length];
            try {
                iArr[TextUtils.TruncateAt.END.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextUtils.TruncateAt.START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextUtils.TruncateAt.MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TextUtils.TruncateAt.MARQUEE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FullWordEllipsisTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.j(context, "context");
    }

    static {
        Pattern patternCompile = Pattern.compile("[\\.!?,;:…]*$", 32);
        Intrinsics.i(patternCompile, "compile(...)");
        f95972u = patternCompile;
    }

    public /* synthetic */ FullWordEllipsisTextView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? R.attr.textViewStyle : i10);
    }

    public final Pattern getEndPunctuationPattern() {
        return this.endPunctuationPattern;
    }

    @Override // android.widget.TextView
    public int getMaxLines() {
        return this.maxLines;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.j(canvas, "canvas");
        if (this.isStale) {
            z();
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt where) {
        if (where == null) {
            this.ellipsizeStrategy = new e();
            return;
        }
        int i10 = h.$EnumSwitchMapping$0[where.ordinal()];
        if (i10 == 1) {
            this.ellipsizeStrategy = new b();
            return;
        }
        if (i10 == 2) {
            this.ellipsizeStrategy = new f();
            return;
        }
        if (i10 == 3) {
            this.ellipsizeStrategy = new d();
        } else {
            if (i10 != 4) {
                this.ellipsizeStrategy = new e();
                return;
            }
            super.setEllipsize(where);
            this.isStale = false;
            this.ellipsizeStrategy = new e();
        }
    }

    public final void setEndPunctuationPattern(Pattern pattern) {
        this.endPunctuationPattern = pattern;
    }

    @Override // android.widget.TextView
    public void setLineSpacing(float add, float mult) {
        this.lineAddVertPad = add;
        this.lineSpacingMult = mult;
        super.setLineSpacing(add, mult);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence text, TextView.BufferType type) {
        if (!this.programmaticChange) {
            this.fullText = text;
            this.isStale = true;
        }
        super.setText(text, type);
    }

    public final Layout x(CharSequence workingText) {
        TextPaint textPaint = new TextPaint(getPaint());
        if (this.textContainsBoldStyle) {
            textPaint.setTypeface(FS.typefaceCreateDerived(Typeface.DEFAULT, 1));
        }
        return new StaticLayout(workingText, textPaint, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), Layout.Alignment.ALIGN_NORMAL, this.lineSpacingMult, this.lineAddVertPad, false);
    }

    public final boolean y() {
        return this.maxLines == Integer.MAX_VALUE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FullWordEllipsisTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.j(context, "context");
        this.ellipsizeListeners = new ArrayList();
        this.lineSpacingMult = 1.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.maxLines}, i10, 0);
        setMaxLines(typedArrayObtainStyledAttributes.getInt(0, a.e.API_PRIORITY_OTHER));
        typedArrayObtainStyledAttributes.recycle();
        this.endPunctuationPattern = f95972u;
    }

    private final void z() {
        boolean z10;
        int maxLines = getMaxLines();
        CharSequence charSequenceF = this.fullText;
        if (maxLines != -1) {
            g gVar = this.ellipsizeStrategy;
            if (gVar != null) {
                charSequenceF = gVar.f(charSequenceF);
                z10 = !gVar.e(this.fullText);
            } else {
                setEllipsize(null);
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (!Intrinsics.e(charSequenceF, getText())) {
            this.programmaticChange = true;
            try {
                setText(charSequenceF);
            } finally {
                this.programmaticChange = false;
            }
        }
        this.isStale = false;
        if (z10 != this.isEllipsized) {
            this.isEllipsized = z10;
            Iterator<c> it = this.ellipsizeListeners.iterator();
            while (it.hasNext()) {
                it.next().a(z10);
            }
        }
    }

    @Override // android.widget.TextView
    public int getLineCount() {
        if (super.getLineCount() == 0) {
            return x(getText()).getLineCount();
        }
        return super.getLineCount();
    }

    @Override // android.view.View
    protected void onSizeChanged(int w10, int h10, int oldw, int oldh) {
        super.onSizeChanged(w10, h10, oldw, oldh);
        if (y()) {
            this.isStale = true;
        }
    }

    @Override // android.widget.TextView
    public void setMaxLines(int maxLines) {
        super.setMaxLines(maxLines);
        this.maxLines = maxLines;
        this.isStale = true;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int left, int top, int right, int bottom) {
        super.setPadding(left, top, right, bottom);
        if (y()) {
            this.isStale = true;
        }
    }
}
