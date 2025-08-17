package Qh;

import Ji.C;
import Ji.LocalThemeScope;
import Qh.C5088h;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.res.Resources;
import android.widget.DatePicker;
import androidx.compose.foundation.text.C5693z;
import androidx.compose.foundation.text.InterfaceC5692y;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.C5763f;
import androidx.compose.ui.focus.InterfaceC5772o;
import j$.time.LocalDate;
import j$.time.format.DateTimeFormatter;
import ji.DefaultTextInputs;
import ji.InterfaceC14919W;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import zi.C18504m0;
import zi.H1;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001ar\u0010\u0013\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2#\u0010\u0012\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\rH\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016²\u0006\u0016\u0010\u0004\u001a\n \u0015*\u0004\u0018\u00010\u00030\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\b\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "", "label", "j$/time/LocalDate", "birthdayDate", "Landroidx/compose/ui/Modifier;", "modifier", "", "isOptional", "j$/time/format/DateTimeFormatter", "formatter", "Landroidx/compose/foundation/text/A;", "keyboardOptions", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "date", "", "onValueChange", "d", "(LJi/M;Ljava/lang/String;Lj$/time/LocalDate;Landroidx/compose/ui/Modifier;ZLj$/time/format/DateTimeFormatter;Landroidx/compose/foundation/text/A;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "kotlin.jvm.PlatformType", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Qh.h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C5088h {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Qh.h$a */
    static final class a implements Function3<InterfaceC14919W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalDate f30215a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ DateTimeFormatter f30216b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ KeyboardOptions f30217c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5772o f30218d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30219e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f30220f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f30221g;

        a(LocalDate localDate, DateTimeFormatter dateTimeFormatter, KeyboardOptions keyboardOptions, InterfaceC5772o interfaceC5772o, LocalThemeScope localThemeScope, String str, String str2) {
            this.f30215a = localDate;
            this.f30216b = dateTimeFormatter;
            this.f30217c = keyboardOptions;
            this.f30218d = interfaceC5772o;
            this.f30219e = localThemeScope;
            this.f30220f = str;
            this.f30221g = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q1.f.TextInput f(KeyboardOptions keyboardOptions, final InterfaceC5772o interfaceC5772o, q1.f.TextInput template) {
            Intrinsics.j(template, "template");
            return q1.f.TextInput.y(template, null, false, null, null, null, keyboardOptions, new C5693z(null, null, new Function1() { // from class: Qh.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C5088h.a.g(interfaceC5772o, (InterfaceC5692y) obj);
                }
            }, null, null, null, 59, null), false, 0, null, null, null, 3999, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(InterfaceC5772o interfaceC5772o, InterfaceC5692y KeyboardActions) {
            Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
            interfaceC5772o.e(C5763f.INSTANCE.a());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(String it) {
            Intrinsics.j(it, "it");
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(InterfaceC14919W interfaceC14919W, String str, String str2, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.i(interfaceC14919W.getLabels().getPlaceholder(), str);
            AdsInputField.d(interfaceC14919W.getLabels().getLabel(), str2);
            H1.w(AdsInputField, interfaceC14919W.getIcons().getFieldIcon(), C.b.h.c.f15464e, null, null, 12, null);
            return Unit.f142422a;
        }

        public final void e(final InterfaceC14919W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(595496674, i10, -1, "com.meijer.mobile.accounts.ux.composables.profile.edit.DateInputField.<anonymous>.<anonymous>.<anonymous> (DateInputField.kt:63)");
            }
            LocalDate localDate = this.f30215a;
            String str = localDate != null ? localDate.format(this.f30216b) : null;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            DefaultTextInputs inputFields = Assemble.getInputFields();
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f30217c) | composer.D(this.f30218d);
            final KeyboardOptions keyboardOptions = this.f30217c;
            final InterfaceC5772o interfaceC5772o = this.f30218d;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Qh.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C5088h.a.f(keyboardOptions, interfaceC5772o, (q1.f.TextInput) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            q1.f.TextInput textInputF = Cr.f.f(inputFields, false, false, false, (Function1) objB, 7, null);
            LocalThemeScope localThemeScope = this.f30219e;
            composer.startReplaceGroup(1849434622);
            Object objB2 = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB2 == companion.a()) {
                objB2 = new Function1() { // from class: Qh.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C5088h.a.k((String) obj);
                    }
                };
                composer.t(objB2);
            }
            Function1 function1 = (Function1) objB2;
            composer.P();
            composer.startReplaceGroup(-1746271574);
            boolean zD = composer.D(Assemble) | composer.V(this.f30220f) | composer.V(this.f30221g);
            final String str3 = this.f30220f;
            final String str4 = this.f30221g;
            Object objB3 = composer.B();
            if (zD || objB3 == companion.a()) {
                objB3 = new Function1() { // from class: Qh.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C5088h.a.l(Assemble, str3, str4, (H1) obj);
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            C18504m0.i(localThemeScope, str2, textInputF, null, function1, (Function1) objB3, composer, LocalThemeScope.f15770g | 24576 | (q1.f.TextInput.f140038m << 6), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14919W interfaceC14919W, Composer composer, Integer num) {
            e(interfaceC14919W, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final Ji.LocalThemeScope r24, final java.lang.String r25, j$.time.LocalDate r26, androidx.compose.ui.Modifier r27, boolean r28, j$.time.format.DateTimeFormatter r29, androidx.compose.foundation.text.KeyboardOptions r30, final kotlin.jvm.functions.Function1<? super j$.time.LocalDate, kotlin.Unit> r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 815
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Qh.C5088h.d(Ji.M, java.lang.String, j$.time.LocalDate, androidx.compose.ui.Modifier, boolean, j$.time.format.DateTimeFormatter, androidx.compose.foundation.text.A, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit e(Context context, final Ref.ObjectRef objectRef, final LocalDate localDate, final Function1 function1) {
        int monthValue;
        DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() { // from class: Qh.c
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
                C5088h.f(objectRef, localDate, function1, datePicker, i10, i11, i12);
            }
        };
        LocalDate localDate2 = (LocalDate) objectRef.f142835a;
        int year = localDate2 != null ? localDate2.getYear() : 0;
        LocalDate localDate3 = (LocalDate) objectRef.f142835a;
        if ((localDate3 != null ? Integer.valueOf(localDate3.getMonthValue()) : null) != null) {
            T t10 = objectRef.f142835a;
            Intrinsics.g(t10);
            monthValue = ((LocalDate) t10).getMonthValue() - 1;
        } else {
            monthValue = 0;
        }
        LocalDate localDate4 = (LocalDate) objectRef.f142835a;
        DatePickerDialog datePickerDialog = new DatePickerDialog(context, onDateSetListener, year, monthValue, localDate4 != null ? localDate4.getDayOfMonth() : 0);
        Zr.a.j(datePickerDialog.getDatePicker(), false, 1, null);
        datePickerDialog.show();
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, j$.time.LocalDate, java.lang.Object] */
    public static final void f(Ref.ObjectRef objectRef, LocalDate localDate, Function1 function1, DatePicker datePicker, int i10, int i11, int i12) {
        ?? Of2 = LocalDate.of(i10, i11 + 1, i12);
        objectRef.f142835a = Of2;
        if (Intrinsics.e(Of2, localDate)) {
            return;
        }
        function1.invoke(objectRef.f142835a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, String str, LocalDate localDate, Modifier modifier, boolean z10, DateTimeFormatter dateTimeFormatter, KeyboardOptions keyboardOptions, Function1 function1, int i10, int i11, Composer composer, int i12) throws Resources.NotFoundException {
        d(localThemeScope, str, localDate, modifier, z10, dateTimeFormatter, keyboardOptions, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
