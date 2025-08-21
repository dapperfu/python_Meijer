package Ik;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u000e\b\u000b\r\u000fB!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\t\u001a\u0004\b\f\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000b\u0010\n\u0082\u0001\u0005\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"LIk/c;", "", "", "fieldName", "type", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "getType", "c", "d", "e", "LIk/c$a;", "LIk/c$b;", "LIk/c$c;", "LIk/c$d;", "LIk/c$e;", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String fieldName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String type;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String message;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\b¨\u0006\u0016"}, d2 = {"LIk/c$a;", "LIk/c;", "", "fieldName", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "a", "e", "b", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ik.c$a, reason: from toString */
    public static final /* data */ class Blank extends c {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fieldName;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String message;

        public /* synthetic */ Blank(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? "can't be blank" : str2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Blank)) {
                return false;
            }
            Blank blank = (Blank) other;
            return Intrinsics.e(this.fieldName, blank.fieldName) && Intrinsics.e(this.message, blank.message);
        }

        @Override // Ik.c
        /* renamed from: a, reason: from getter */
        public String getFieldName() {
            return this.fieldName;
        }

        @Override // Ik.c
        /* renamed from: b, reason: from getter */
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return (this.fieldName.hashCode() * 31) + this.message.hashCode();
        }

        public String toString() {
            return "Blank(fieldName=" + this.fieldName + ", message=" + this.message + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Blank(String fieldName, String message) {
            super(fieldName, "blank", message, null);
            Intrinsics.j(fieldName, "fieldName");
            Intrinsics.j(message, "message");
            this.fieldName = fieldName;
            this.message = message;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\b¨\u0006\u0016"}, d2 = {"LIk/c$b;", "LIk/c;", "", "fieldName", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "a", "e", "b", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ik.c$b, reason: from toString */
    public static final /* data */ class Empty extends c {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fieldName;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String message;

        public /* synthetic */ Empty(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? "can't be empty" : str2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Empty)) {
                return false;
            }
            Empty empty = (Empty) other;
            return Intrinsics.e(this.fieldName, empty.fieldName) && Intrinsics.e(this.message, empty.message);
        }

        @Override // Ik.c
        /* renamed from: a, reason: from getter */
        public String getFieldName() {
            return this.fieldName;
        }

        @Override // Ik.c
        /* renamed from: b, reason: from getter */
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return (this.fieldName.hashCode() * 31) + this.message.hashCode();
        }

        public String toString() {
            return "Empty(fieldName=" + this.fieldName + ", message=" + this.message + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Empty(String fieldName, String message) {
            super(fieldName, "empty", message, null);
            Intrinsics.j(fieldName, "fieldName");
            Intrinsics.j(message, "message");
            this.fieldName = fieldName;
            this.message = message;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\t¨\u0006\u0019"}, d2 = {"LIk/c$c;", "LIk/c;", "", "fieldName", "type", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "a", "e", "getType", "f", "b", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ik.c$c, reason: collision with other inner class name and from toString */
    public static final /* data */ class Invalid extends c {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fieldName;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String type;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String message;

        public /* synthetic */ Invalid(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? "invalid" : str2, (i10 & 4) != 0 ? "is not valid" : str3);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Invalid)) {
                return false;
            }
            Invalid invalid = (Invalid) other;
            return Intrinsics.e(this.fieldName, invalid.fieldName) && Intrinsics.e(this.type, invalid.type) && Intrinsics.e(this.message, invalid.message);
        }

        @Override // Ik.c
        /* renamed from: a, reason: from getter */
        public String getFieldName() {
            return this.fieldName;
        }

        @Override // Ik.c
        /* renamed from: b, reason: from getter */
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return (((this.fieldName.hashCode() * 31) + this.type.hashCode()) * 31) + this.message.hashCode();
        }

        public String toString() {
            return "Invalid(fieldName=" + this.fieldName + ", type=" + this.type + ", message=" + this.message + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Invalid(String fieldName, String type, String message) {
            super(fieldName, type, message, null);
            Intrinsics.j(fieldName, "fieldName");
            Intrinsics.j(type, "type");
            Intrinsics.j(message, "message");
            this.fieldName = fieldName;
            this.type = type;
            this.message = message;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\b¨\u0006\u0016"}, d2 = {"LIk/c$d;", "LIk/c;", "", "fieldName", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "a", "e", "b", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ik.c$d, reason: from toString */
    public static final /* data */ class Null extends c {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fieldName;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String message;

        public /* synthetic */ Null(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? "can't be null" : str2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Null)) {
                return false;
            }
            Null r52 = (Null) other;
            return Intrinsics.e(this.fieldName, r52.fieldName) && Intrinsics.e(this.message, r52.message);
        }

        @Override // Ik.c
        /* renamed from: a, reason: from getter */
        public String getFieldName() {
            return this.fieldName;
        }

        @Override // Ik.c
        /* renamed from: b, reason: from getter */
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return (this.fieldName.hashCode() * 31) + this.message.hashCode();
        }

        public String toString() {
            return "Null(fieldName=" + this.fieldName + ", message=" + this.message + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Null(String fieldName, String message) {
            super(fieldName, "missing", message, null);
            Intrinsics.j(fieldName, "fieldName");
            Intrinsics.j(message, "message");
            this.fieldName = fieldName;
            this.message = message;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"LIk/c$e;", "LIk/c;", "", "fieldName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "a", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ik.c$e, reason: from toString */
    public static final /* data */ class Pending extends c {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fieldName;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Pending) && Intrinsics.e(this.fieldName, ((Pending) other).fieldName);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Pending(String fieldName) {
            super(fieldName, "pending", "not yet validated", null);
            Intrinsics.j(fieldName, "fieldName");
            this.fieldName = fieldName;
        }

        @Override // Ik.c
        /* renamed from: a, reason: from getter */
        public String getFieldName() {
            return this.fieldName;
        }

        public int hashCode() {
            return this.fieldName.hashCode();
        }

        public String toString() {
            return "Pending(fieldName=" + this.fieldName + ')';
        }
    }

    public /* synthetic */ c(String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3);
    }

    private c(String str, String str2, String str3) {
        this.fieldName = str;
        this.type = str2;
        this.message = str3;
    }

    /* renamed from: a, reason: from getter */
    public String getFieldName() {
        return this.fieldName;
    }

    /* renamed from: b, reason: from getter */
    public String getMessage() {
        return this.message;
    }
}
