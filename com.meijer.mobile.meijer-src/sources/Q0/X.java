package Q0;

import android.view.ViewStructure;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a5\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroid/view/ViewStructure;", "Lr1/j;", "semanticsInfo", "Landroid/view/autofill/AutofillId;", "rootAutofillId", "", "packageName", "Ls1/b;", "rectManager", "", "a", "(Landroid/view/ViewStructure;Lr1/j;Landroid/view/autofill/AutofillId;Ljava/lang/String;Ls1/b;)V", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class X {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "left", "top", "right", "bottom", "", "a", "(IIII)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function4<Integer, Integer, Integer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ y f27485f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ViewStructure f27486g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y yVar, ViewStructure viewStructure) {
            super(4);
            this.f27485f = yVar;
            this.f27486g = viewStructure;
        }

        public final void a(int i10, int i11, int i12, int i13) {
            this.f27485f.r(this.f27486g, i10, i11, 0, 0, i12 - i10, i13 - i11);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, Integer num3, Integer num4) {
            a(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0187 A[PHI: r21 r22 r23 r24 r25 r26 r27 r28 r29
      0x0187: PHI (r21v6 Q0.L) = (r21v5 Q0.L), (r21v7 Q0.L) binds: [B:10:0x004d, B:62:0x0185] A[DONT_GENERATE, DONT_INLINE]
      0x0187: PHI (r22v6 boolean) = (r22v5 boolean), (r22v7 boolean) binds: [B:10:0x004d, B:62:0x0185] A[DONT_GENERATE, DONT_INLINE]
      0x0187: PHI (r23v10 t1.a) = (r23v9 t1.a), (r23v11 t1.a) binds: [B:10:0x004d, B:62:0x0185] A[DONT_GENERATE, DONT_INLINE]
      0x0187: PHI (r24v6 Q0.N) = (r24v5 Q0.N), (r24v7 Q0.N) binds: [B:10:0x004d, B:62:0x0185] A[DONT_GENERATE, DONT_INLINE]
      0x0187: PHI (r25v6 java.lang.Boolean) = (r25v5 java.lang.Boolean), (r25v7 java.lang.Boolean) binds: [B:10:0x004d, B:62:0x0185] A[DONT_GENERATE, DONT_INLINE]
      0x0187: PHI (r26v6 androidx.compose.ui.semantics.Role) = (r26v5 androidx.compose.ui.semantics.Role), (r26v7 androidx.compose.ui.semantics.Role) binds: [B:10:0x004d, B:62:0x0185] A[DONT_GENERATE, DONT_INLINE]
      0x0187: PHI (r27v6 boolean) = (r27v5 boolean), (r27v7 boolean) binds: [B:10:0x004d, B:62:0x0185] A[DONT_GENERATE, DONT_INLINE]
      0x0187: PHI (r28v6 java.lang.Integer) = (r28v5 java.lang.Integer), (r28v7 java.lang.Integer) binds: [B:10:0x004d, B:62:0x0185] A[DONT_GENERATE, DONT_INLINE]
      0x0187: PHI (r29v6 androidx.compose.ui.text.AnnotatedString) = (r29v5 androidx.compose.ui.text.AnnotatedString), (r29v7 androidx.compose.ui.text.AnnotatedString) binds: [B:10:0x004d, B:62:0x0185] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x024a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(android.view.ViewStructure r38, r1.InterfaceC16816j r39, android.view.autofill.AutofillId r40, java.lang.String r41, s1.b r42) {
        /*
            Method dump skipped, instructions count: 939
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.X.a(android.view.ViewStructure, r1.j, android.view.autofill.AutofillId, java.lang.String, s1.b):void");
    }
}
