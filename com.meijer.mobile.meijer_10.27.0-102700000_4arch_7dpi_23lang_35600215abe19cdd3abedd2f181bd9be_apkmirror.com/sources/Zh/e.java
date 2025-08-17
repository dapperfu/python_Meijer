package Zh;

import Hk.Validation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u0007\u000bB\u0017\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"LZh/e;", "T", "LZj/a;", "LHk/b;", "validation", "<init>", "(LHk/b;)V", "a", "LHk/b;", "c", "()LHk/b;", "b", "LZh/e$a;", "LZh/e$b;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class e<T> implements Zj.a<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Validation<T> validation;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000f¨\u0006\u001e"}, d2 = {"LZh/e$a;", "LZh/e;", "", "LHk/b;", "validation", "selectedSubstitutionPreference", "", "selectedSubstitutionIndex", "<init>", "(LHk/b;Ljava/lang/String;I)V", "f", "()LZh/e$a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LHk/b;", "c", "()LHk/b;", "Ljava/lang/String;", "e", "d", "I", "getSelectedSubstitutionIndex", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Zh.e$a, reason: from toString */
    public static final /* data */ class GrocerySubstitution extends e<String> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Validation<String> validation;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String selectedSubstitutionPreference;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final int selectedSubstitutionIndex;

        public GrocerySubstitution() {
            this(null, null, 0, 7, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GrocerySubstitution)) {
                return false;
            }
            GrocerySubstitution grocerySubstitution = (GrocerySubstitution) other;
            return Intrinsics.e(this.validation, grocerySubstitution.validation) && Intrinsics.e(this.selectedSubstitutionPreference, grocerySubstitution.selectedSubstitutionPreference) && this.selectedSubstitutionIndex == grocerySubstitution.selectedSubstitutionIndex;
        }

        public GrocerySubstitution f() {
            return this;
        }

        public /* synthetic */ GrocerySubstitution(Validation validation, String str, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? new Validation("", null, 2, null) : validation, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? 0 : i10);
        }

        @Override // Zh.e, Zj.a
        public Validation<String> c() {
            return this.validation;
        }

        /* renamed from: e, reason: from getter */
        public final String getSelectedSubstitutionPreference() {
            return this.selectedSubstitutionPreference;
        }

        public int hashCode() {
            int iHashCode = this.validation.hashCode() * 31;
            String str = this.selectedSubstitutionPreference;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.selectedSubstitutionIndex);
        }

        public String toString() {
            return "GrocerySubstitution(validation=" + this.validation + ", selectedSubstitutionPreference=" + this.selectedSubstitutionPreference + ", selectedSubstitutionIndex=" + this.selectedSubstitutionIndex + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GrocerySubstitution(Validation<String> validation, String str, int i10) {
            super(validation, null);
            Intrinsics.j(validation, "validation");
            this.validation = validation;
            this.selectedSubstitutionPreference = str;
            this.selectedSubstitutionIndex = i10;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"LZh/e$b;", "LZh/e;", "", "LHk/b;", "validation", "description", "<init>", "(LHk/b;Ljava/lang/String;)V", "f", "()LZh/e$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LHk/b;", "c", "()LHk/b;", "Ljava/lang/String;", "e", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Zh.e$b, reason: from toString */
    public static final /* data */ class VehicleDescription extends e<String> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Validation<String> validation;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String description;

        /* JADX WARN: Multi-variable type inference failed */
        public VehicleDescription() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VehicleDescription)) {
                return false;
            }
            VehicleDescription vehicleDescription = (VehicleDescription) other;
            return Intrinsics.e(this.validation, vehicleDescription.validation) && Intrinsics.e(this.description, vehicleDescription.description);
        }

        public VehicleDescription f() {
            return this;
        }

        public /* synthetic */ VehicleDescription(Validation validation, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new Validation("", null, 2, null) : validation, (i10 & 2) != 0 ? null : str);
        }

        @Override // Zh.e, Zj.a
        public Validation<String> c() {
            return this.validation;
        }

        /* renamed from: e, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        public int hashCode() {
            int iHashCode = this.validation.hashCode() * 31;
            String str = this.description;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "VehicleDescription(validation=" + this.validation + ", description=" + this.description + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VehicleDescription(Validation<String> validation, String str) {
            super(validation, null);
            Intrinsics.j(validation, "validation");
            this.validation = validation;
            this.description = str;
        }
    }

    public /* synthetic */ e(Validation validation, DefaultConstructorMarker defaultConstructorMarker) {
        this(validation);
    }

    private e(Validation<T> validation) {
        this.validation = validation;
    }

    @Override // Zj.a
    public Validation<T> c() {
        return this.validation;
    }
}
