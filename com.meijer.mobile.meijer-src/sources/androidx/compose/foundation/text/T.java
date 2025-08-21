package androidx.compose.foundation.text;

import V0.C5474k1;
import V0.C5489q0;
import V0.o1;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.input.ImeOptions;
import java.util.List;
import kotlin.C17769H;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import u1.C17334A;
import u1.TextLayoutResult;
import z1.C18428k;
import z1.InterfaceC18417E;
import z1.InterfaceC18426i;
import z1.TextFieldValue;
import z1.TransformedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/T;", "", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010JH\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\n0\u00182\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\nH\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJR\u0010#\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010 \u001a\u00020\f2\u0006\u0010\"\u001a\u00020!H\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$JG\u0010+\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b+\u0010,J/\u0010/\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'2\u0006\u0010-\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020.H\u0001¢\u0006\u0004\b/\u00100JC\u00109\u001a\u00020\u000e2\f\u00103\u001a\b\u0012\u0004\u0012\u000202012\u0006\u00105\u001a\u0002042\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000e062\b\u00108\u001a\u0004\u0018\u00010'H\u0001¢\u0006\u0004\b9\u0010:JF\u0010=\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020;2\u0006\u0010\u000b\u001a\u00020.2\u0006\u00105\u001a\u0002042\u0006\u0010\t\u001a\u00020\b2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000e06H\u0001ø\u0001\u0000¢\u0006\u0004\b=\u0010>JW\u0010E\u001a\u00020'2\u0006\u0010@\u001a\u00020?2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u00105\u001a\u0002042\u0006\u0010B\u001a\u00020A2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000e062\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u000e06H\u0001¢\u0006\u0004\bE\u0010FJW\u0010G\u001a\u00020'2\u0006\u0010@\u001a\u00020?2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u00105\u001a\u0002042\u0006\u0010B\u001a\u00020A2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000e062\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u000e06H\u0001¢\u0006\u0004\bG\u0010FJ3\u0010H\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'2\u0006\u00105\u001a\u0002042\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000e06H\u0001¢\u0006\u0004\bH\u0010IJ \u0010M\u001a\u00020K2\u0006\u0010J\u001a\u00020\u00062\u0006\u0010L\u001a\u00020Kø\u0001\u0000¢\u0006\u0004\bM\u0010N\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006O"}, d2 = {"Landroidx/compose/foundation/text/T$a;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Landroidx/compose/ui/text/y;", "range", "Lz1/E;", "offsetMapping", "Lu1/v;", "textLayoutResult", "LV0/o1;", "paint", "", "c", "(Landroidx/compose/ui/graphics/Canvas;JLz1/E;Lu1/v;LV0/o1;)V", "Landroidx/compose/foundation/text/N;", "textDelegate", "LH1/b;", "constraints", "LH1/t;", "layoutDirection", "prevResultText", "Lkotlin/Triple;", "", "d", "(Landroidx/compose/foundation/text/N;JLH1/t;Lu1/v;)Lkotlin/Triple;", "Lz1/M;", "value", "selectionPreviewHighlightRange", "deletionPreviewHighlightRange", "highlightPaint", "LV0/q0;", "selectionBackgroundColor", "b", "(Landroidx/compose/ui/graphics/Canvas;Lz1/M;JJLz1/E;Lu1/v;LV0/o1;J)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", "Lz1/T;", "textInputSession", "", "hasFocus", "e", "(Lz1/M;Landroidx/compose/foundation/text/N;Lu1/v;Landroidx/compose/ui/layout/LayoutCoordinates;Lz1/T;ZLz1/E;)V", "textFieldValue", "Landroidx/compose/foundation/text/h0;", "k", "(Lz1/T;Lz1/M;Lz1/E;Landroidx/compose/foundation/text/h0;)V", "", "Lz1/i;", "ops", "Lz1/k;", "editProcessor", "Lkotlin/Function1;", "onValueChange", "session", "g", "(Ljava/util/List;Lz1/k;Lkotlin/jvm/functions/Function1;Lz1/T;)V", "LU0/f;", "position", "j", "(JLandroidx/compose/foundation/text/h0;Lz1/k;Lz1/E;Lkotlin/jvm/functions/Function1;)V", "Lz1/O;", "textInputService", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Landroidx/compose/ui/text/input/a;", "onImeActionPerformed", "i", "(Lz1/O;Lz1/M;Lz1/k;Landroidx/compose/ui/text/input/ImeOptions;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lz1/T;", "h", "f", "(Lz1/T;Lz1/k;Lkotlin/jvm/functions/Function1;)V", "compositionRange", "Lz1/U;", "transformed", "a", "(JLz1/U;)Lz1/U;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.compose.foundation.text.T$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lz1/i;", "it", "", "a", "(Ljava/util/List;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.foundation.text.T$a$a, reason: collision with other inner class name */
        static final class C1025a extends Lambda implements Function1<List<? extends InterfaceC18426i>, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C18428k f49488f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function1<TextFieldValue, Unit> f49489g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef<z1.T> f49490h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C1025a(C18428k c18428k, Function1<? super TextFieldValue, Unit> function1, Ref.ObjectRef<z1.T> objectRef) {
                super(1);
                this.f49488f = c18428k;
                this.f49489g = function1;
                this.f49490h = objectRef;
            }

            public final void a(List<? extends InterfaceC18426i> list) {
                T.INSTANCE.g(list, this.f49488f, this.f49489g, this.f49490h.f143742a);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends InterfaceC18426i> list) {
                a(list);
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LV0/k1;", "matrix", "", "a", "([F)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.foundation.text.T$a$b */
        static final class b extends Lambda implements Function1<C5474k1, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ LayoutCoordinates f49491f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(LayoutCoordinates layoutCoordinates) {
                super(1);
                this.f49491f = layoutCoordinates;
            }

            public final void a(float[] fArr) {
                if (this.f49491f.isAttached()) {
                    LayoutCoordinatesKt.c(this.f49491f).O(this.f49491f, fArr);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C5474k1 c5474k1) {
                a(c5474k1.getValues());
                return Unit.f143329a;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void j(long position, h0 textLayoutResult, C18428k editProcessor, InterfaceC18417E offsetMapping, Function1<? super TextFieldValue, Unit> onValueChange) {
            onValueChange.invoke(TextFieldValue.c(editProcessor.getMBufferState(), null, C17334A.a(offsetMapping.a(h0.e(textLayoutResult, position, false, 2, null))), null, 5, null));
        }

        private Companion() {
        }

        @JvmStatic
        public final void e(TextFieldValue value, N textDelegate, TextLayoutResult textLayoutResult, LayoutCoordinates layoutCoordinates, z1.T textInputSession, boolean hasFocus, InterfaceC18417E offsetMapping) {
            if (hasFocus) {
                int iB = offsetMapping.b(androidx.compose.ui.text.y.k(value.getSelection()));
                Rect rectD = iB < textLayoutResult.getLayoutInput().getText().length() ? textLayoutResult.d(iB) : iB != 0 ? textLayoutResult.d(iB - 1) : new Rect(0.0f, 0.0f, 1.0f, (int) (U.b(textDelegate.getStyle(), textDelegate.getDensity(), textDelegate.getFontFamilyResolver(), null, 0, 24, null) & 4294967295L));
                long jR0 = layoutCoordinates.r0(U0.f.e((Float.floatToRawIntBits(rectD.getTop()) & 4294967295L) | (Float.floatToRawIntBits(rectD.getLeft()) << 32)));
                textInputSession.c(U0.h.b(U0.f.e((Float.floatToRawIntBits(Float.intBitsToFloat((int) (jR0 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (jR0 >> 32))) << 32)), U0.k.d((Float.floatToRawIntBits(rectD.i() - rectD.getTop()) & 4294967295L) | (Float.floatToRawIntBits(rectD.l() - rectD.getLeft()) << 32))));
            }
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [T, z1.T] */
        @JvmStatic
        public final z1.T i(z1.O textInputService, TextFieldValue value, C18428k editProcessor, ImeOptions imeOptions, Function1<? super TextFieldValue, Unit> onValueChange, Function1<? super androidx.compose.ui.text.input.a, Unit> onImeActionPerformed) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ?? D10 = textInputService.d(value, imeOptions, new C1025a(editProcessor, onValueChange, objectRef), onImeActionPerformed);
            objectRef.f143742a = D10;
            return D10;
        }

        private final void c(Canvas canvas, long range, InterfaceC18417E offsetMapping, TextLayoutResult textLayoutResult, o1 paint) {
            int iB = offsetMapping.b(androidx.compose.ui.text.y.l(range));
            int iB2 = offsetMapping.b(androidx.compose.ui.text.y.k(range));
            if (iB != iB2) {
                canvas.s(textLayoutResult.z(iB, iB2), paint);
            }
        }

        public final TransformedText a(long compositionRange, TransformedText transformed) {
            int iB = transformed.getOffsetMapping().b(androidx.compose.ui.text.y.n(compositionRange));
            int iB2 = transformed.getOffsetMapping().b(androidx.compose.ui.text.y.i(compositionRange));
            int iMin = Math.min(iB, iB2);
            int iMax = Math.max(iB, iB2);
            AnnotatedString.b bVar = new AnnotatedString.b(transformed.getText());
            bVar.a(new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, F1.k.INSTANCE.d(), null, null, null, 61439, null), iMin, iMax);
            return new TransformedText(bVar.q(), transformed.getOffsetMapping());
        }

        @JvmStatic
        public final void b(Canvas canvas, TextFieldValue value, long selectionPreviewHighlightRange, long deletionPreviewHighlightRange, InterfaceC18417E offsetMapping, TextLayoutResult textLayoutResult, o1 highlightPaint, long selectionBackgroundColor) {
            long jA;
            if (!androidx.compose.ui.text.y.h(selectionPreviewHighlightRange)) {
                highlightPaint.x(selectionBackgroundColor);
                c(canvas, selectionPreviewHighlightRange, offsetMapping, textLayoutResult, highlightPaint);
            } else if (!androidx.compose.ui.text.y.h(deletionPreviewHighlightRange)) {
                C5489q0 c5489q0M = C5489q0.m(textLayoutResult.getLayoutInput().getStyle().h());
                if (c5489q0M.getValue() == 16) {
                    c5489q0M = null;
                }
                if (c5489q0M != null) {
                    jA = c5489q0M.getValue();
                } else {
                    jA = C5489q0.INSTANCE.a();
                }
                long j10 = jA;
                highlightPaint.x(C5489q0.q(j10, C5489q0.t(j10) * 0.2f, 0.0f, 0.0f, 0.0f, 14, null));
                c(canvas, deletionPreviewHighlightRange, offsetMapping, textLayoutResult, highlightPaint);
            } else if (!androidx.compose.ui.text.y.h(value.getSelection())) {
                highlightPaint.x(selectionBackgroundColor);
                c(canvas, value.getSelection(), offsetMapping, textLayoutResult, highlightPaint);
            }
            u1.z.f163680a.a(canvas, textLayoutResult);
        }

        @JvmStatic
        public final Triple<Integer, Integer, TextLayoutResult> d(N textDelegate, long constraints, H1.t layoutDirection, TextLayoutResult prevResultText) {
            TextLayoutResult textLayoutResultL = textDelegate.l(constraints, layoutDirection, prevResultText);
            return new Triple<>(Integer.valueOf((int) (textLayoutResultL.getSize() >> 32)), Integer.valueOf((int) (textLayoutResultL.getSize() & 4294967295L)), textLayoutResultL);
        }

        @JvmStatic
        public final void f(z1.T textInputSession, C18428k editProcessor, Function1<? super TextFieldValue, Unit> onValueChange) {
            onValueChange.invoke(TextFieldValue.c(editProcessor.getMBufferState(), null, 0L, null, 3, null));
            textInputSession.a();
        }

        @JvmStatic
        public final void g(List<? extends InterfaceC18426i> ops, C18428k editProcessor, Function1<? super TextFieldValue, Unit> onValueChange, z1.T session) {
            TextFieldValue textFieldValueB = editProcessor.b(ops);
            if (session != null) {
                session.d(null, textFieldValueB);
            }
            onValueChange.invoke(textFieldValueB);
        }

        @JvmStatic
        public final z1.T h(z1.O textInputService, TextFieldValue value, C18428k editProcessor, ImeOptions imeOptions, Function1<? super TextFieldValue, Unit> onValueChange, Function1<? super androidx.compose.ui.text.input.a, Unit> onImeActionPerformed) {
            return i(textInputService, value, editProcessor, imeOptions, onValueChange, onImeActionPerformed);
        }

        @JvmStatic
        public final void k(z1.T textInputSession, TextFieldValue textFieldValue, InterfaceC18417E offsetMapping, h0 textLayoutResult) {
            LayoutCoordinates decorationBoxCoordinates;
            LayoutCoordinates innerTextFieldCoordinates = textLayoutResult.getInnerTextFieldCoordinates();
            if (innerTextFieldCoordinates != null && innerTextFieldCoordinates.isAttached() && (decorationBoxCoordinates = textLayoutResult.getDecorationBoxCoordinates()) != null) {
                textInputSession.e(textFieldValue, offsetMapping, textLayoutResult.getValue(), new b(innerTextFieldCoordinates), C17769H.i(innerTextFieldCoordinates), innerTextFieldCoordinates.b0(decorationBoxCoordinates, false));
            }
        }
    }
}
