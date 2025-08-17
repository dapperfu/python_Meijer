package Zh;

import Fh.h;
import Hk.Validation;
import Hk.c;
import ak.AbstractC5607a;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0004\t\u000b\f\u0007B\u0017\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\u0082\u0001\u0004\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"LZh/a;", "T", "LZj/a;", "LHk/b;", "validation", "<init>", "(LHk/b;)V", "a", "LHk/b;", "c", "()LHk/b;", "b", "d", "LZh/a$a;", "LZh/a$b;", "LZh/a$c;", "LZh/a$d;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class a<T> implements Zj.a<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Validation<T> validation;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"LZh/a$a;", "LZh/a;", "", "LHk/b;", "validation", "password", "<init>", "(LHk/b;Ljava/lang/String;)V", "f", "()LZh/a$a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LHk/b;", "c", "()LHk/b;", "Ljava/lang/String;", "e", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Zh.a$a, reason: collision with other inner class name and from toString */
    public static final /* data */ class ConfirmPassword extends a<String> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Validation<String> validation;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String password;

        /* JADX WARN: Multi-variable type inference failed */
        public ConfirmPassword() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConfirmPassword)) {
                return false;
            }
            ConfirmPassword confirmPassword = (ConfirmPassword) other;
            return Intrinsics.e(this.validation, confirmPassword.validation) && Intrinsics.e(this.password, confirmPassword.password);
        }

        public ConfirmPassword f() {
            return this;
        }

        public /* synthetic */ ConfirmPassword(Validation validation, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new Validation("", null, 2, null) : validation, (i10 & 2) != 0 ? null : str);
        }

        @Override // Zh.a, Zj.a
        public Validation<String> c() {
            return this.validation;
        }

        /* renamed from: e, reason: from getter */
        public final String getPassword() {
            return this.password;
        }

        public int hashCode() {
            int iHashCode = this.validation.hashCode() * 31;
            String str = this.password;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "ConfirmPassword(validation=" + this.validation + ", password=" + this.password + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConfirmPassword(Validation<String> validation, String str) {
            super(validation, null);
            Intrinsics.j(validation, "validation");
            this.validation = validation;
            this.password = str;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"LZh/a$b;", "LZh/a;", "", "LHk/b;", "validation", "password", "<init>", "(LHk/b;Ljava/lang/String;)V", "f", "()LZh/a$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LHk/b;", "c", "()LHk/b;", "Ljava/lang/String;", "e", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Zh.a$b, reason: from toString */
    public static final /* data */ class CurrentPassword extends a<String> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Validation<String> validation;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String password;

        /* JADX WARN: Multi-variable type inference failed */
        public CurrentPassword() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CurrentPassword)) {
                return false;
            }
            CurrentPassword currentPassword = (CurrentPassword) other;
            return Intrinsics.e(this.validation, currentPassword.validation) && Intrinsics.e(this.password, currentPassword.password);
        }

        public CurrentPassword f() {
            return this;
        }

        public /* synthetic */ CurrentPassword(Validation validation, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new Validation("", null, 2, null) : validation, (i10 & 2) != 0 ? null : str);
        }

        @Override // Zh.a, Zj.a
        public Validation<String> c() {
            return this.validation;
        }

        /* renamed from: e, reason: from getter */
        public final String getPassword() {
            return this.password;
        }

        public int hashCode() {
            int iHashCode = this.validation.hashCode() * 31;
            String str = this.password;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "CurrentPassword(validation=" + this.validation + ", password=" + this.password + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CurrentPassword(Validation<String> validation, String str) {
            super(validation, null);
            Intrinsics.j(validation, "validation");
            this.validation = validation;
            this.password = str;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001c"}, d2 = {"LZh/a$c;", "LZh/a;", "", "LHk/b;", "validation", "<init>", "(LHk/b;)V", "f", "()LZh/a$c;", "e", "(LHk/b;)LZh/a$c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LHk/b;", "c", "()LHk/b;", "Lak/a;", "()Lak/a;", "errorMessage", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Zh.a$c, reason: from toString */
    public static final /* data */ class Email extends a<String> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Validation<String> validation;

        /* JADX WARN: Multi-variable type inference failed */
        public Email() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Email) && Intrinsics.e(this.validation, ((Email) other).validation);
        }

        public /* synthetic */ Email(Validation validation, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new Validation("", null, 2, null) : validation);
        }

        @Override // Zh.a, Zj.a
        public Validation<String> c() {
            return this.validation;
        }

        public final Email e(Validation<String> validation) {
            Intrinsics.j(validation, "validation");
            return new Email(validation);
        }

        public int hashCode() {
            return this.validation.hashCode();
        }

        public String toString() {
            return "Email(validation=" + this.validation + ')';
        }

        @Override // Zj.a
        public AbstractC5607a b() {
            Hk.c cVar = (Hk.c) CollectionsKt.u0(d());
            if (cVar instanceof c.Blank) {
                return AbstractC5607a.INSTANCE.d(h.f10815w5, new Object[0]);
            }
            if (cVar instanceof c.Invalid) {
                return AbstractC5607a.INSTANCE.d(h.f10815w5, new Object[0]);
            }
            return super.b();
        }

        public Email f() {
            return e(c().j(new Ik.d(new PropertyReference0Impl(this) { // from class: Zh.a.c.a
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((Email) this.receiver).c();
                }
            }, "email"), new Ik.b(new PropertyReference0Impl(this) { // from class: Zh.a.c.b
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((Email) this.receiver).c();
                }
            }, "email")));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Email(Validation<String> validation) {
            super(validation, null);
            Intrinsics.j(validation, "validation");
            this.validation = validation;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"LZh/a$d;", "LZh/a;", "", "LHk/b;", "validation", "password", "<init>", "(LHk/b;Ljava/lang/String;)V", "f", "()LZh/a$d;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LHk/b;", "c", "()LHk/b;", "Ljava/lang/String;", "e", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Zh.a$d, reason: from toString */
    public static final /* data */ class NewPassword extends a<String> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Validation<String> validation;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String password;

        /* JADX WARN: Multi-variable type inference failed */
        public NewPassword() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NewPassword)) {
                return false;
            }
            NewPassword newPassword = (NewPassword) other;
            return Intrinsics.e(this.validation, newPassword.validation) && Intrinsics.e(this.password, newPassword.password);
        }

        public NewPassword f() {
            return this;
        }

        public /* synthetic */ NewPassword(Validation validation, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new Validation("", null, 2, null) : validation, (i10 & 2) != 0 ? null : str);
        }

        @Override // Zh.a, Zj.a
        public Validation<String> c() {
            return this.validation;
        }

        /* renamed from: e, reason: from getter */
        public final String getPassword() {
            return this.password;
        }

        public int hashCode() {
            int iHashCode = this.validation.hashCode() * 31;
            String str = this.password;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "NewPassword(validation=" + this.validation + ", password=" + this.password + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewPassword(Validation<String> validation, String str) {
            super(validation, null);
            Intrinsics.j(validation, "validation");
            this.validation = validation;
            this.password = str;
        }
    }

    public /* synthetic */ a(Validation validation, DefaultConstructorMarker defaultConstructorMarker) {
        this(validation);
    }

    private a(Validation<T> validation) {
        this.validation = validation;
    }

    @Override // Zj.a
    public Validation<T> c() {
        return this.validation;
    }
}
