package Ao;

import Ao.W;
import Co.ProductFullDetails;
import Ho.ProductSponsorship;
import androidx.recyclerview.widget.RecyclerView;
import ej.AllDiscountDetails;
import ej.EntryChange;
import ej.PromoDiscount;
import hi.AbstractC14482i;
import hi.C14476c;
import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0014\u00172B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0007¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u0004\u0018\u00010\u00162\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0019\u001a\u00020\u00162\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010#\u001a\u00020\u00162\u000e\u0010\"\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`!¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00162\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00162\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u00162\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b/\u00100R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u00101¨\u00063"}, d2 = {"LAo/W;", "", "<init>", "()V", "LAo/W$b;", "detailItem", "", "Lhi/i;", "i", "(LAo/W$b;)[Lhi/i;", "", "detailItems", "j", "(Ljava/util/List;)[Lhi/i;", "", "truncationLimit", "l", "(Ljava/util/List;I)[Lhi/i;", "", "input", "b", "(Ljava/lang/String;)Ljava/lang/String;", "Lhi/i$b;", "c", "(Ljava/util/List;)Lhi/i$b;", "d", "LAo/W$c;", "substitutionPair", "", "n", "(LAo/W$c;)V", "o", "()LAo/W$c;", "Lcom/meijer/mobile/core/models/products/ProductCode;", "code", "g", "(Ljava/lang/String;)Lhi/i$b;", "Lmk/f;", "product", "h", "(Lmk/f;)Lhi/i$b;", "Lej/j;", "entryChange", "f", "(Lej/j;)Lhi/i$b;", "", "quantity", "k", "(Ljava/lang/Double;)Lhi/i$b;", "LAo/W$c;", "a", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    public static final W f1200a = new W();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static SubstitutionPair substitutionPair;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\t¨\u0006\u0016"}, d2 = {"LAo/W$a;", "", "", "promoId", "", "promoText", "<init>", "(Ljava/lang/Long;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Long;", "()Ljava/lang/Long;", "b", "Ljava/lang/String;", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ao.W$a, reason: from toString */
    public static final /* data */ class ComplexPromo {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Long promoId;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String promoText;

        /* JADX WARN: Multi-variable type inference failed */
        public ComplexPromo() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ComplexPromo)) {
                return false;
            }
            ComplexPromo complexPromo = (ComplexPromo) other;
            return Intrinsics.e(this.promoId, complexPromo.promoId) && Intrinsics.e(this.promoText, complexPromo.promoText);
        }

        public ComplexPromo(Long l10, String str) {
            this.promoId = l10;
            this.promoText = str;
        }

        /* renamed from: a, reason: from getter */
        public final Long getPromoId() {
            return this.promoId;
        }

        /* renamed from: b, reason: from getter */
        public final String getPromoText() {
            return this.promoText;
        }

        public int hashCode() {
            Long l10 = this.promoId;
            int iHashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
            String str = this.promoText;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "ComplexPromo(promoId=" + this.promoId + ", promoText=" + this.promoText + ')';
        }

        public /* synthetic */ ComplexPromo(Long l10, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? 0L : l10, (i10 & 2) != 0 ? null : str);
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\bh\b\u0086\b\u0018\u0000 \u009b\u00012\u00020\u0001:\u0001FBÃ\u0004\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000104\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000104\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\u0002¢\u0006\u0004\b<\u0010=JÐ\u0004\u0010>\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00103\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00105\u001a\u0004\u0018\u0001042\n\b\u0002\u00106\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00107\u001a\u0004\u0018\u0001042\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b@\u0010=J\u0010\u0010A\u001a\u000204HÖ\u0001¢\u0006\u0004\bA\u0010BJ\u001a\u0010D\u001a\u00020\f2\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bD\u0010ER\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010=R\u001f\u0010\u0005\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\bI\u0010G\u001a\u0004\bJ\u0010=R\u001f\u0010\u0006\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\bK\u0010G\u001a\u0004\bL\u0010=R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bQ\u0010N\u001a\u0004\bR\u0010PR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bS\u0010N\u001a\u0004\bT\u0010PR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bU\u0010G\u001a\u0004\bV\u0010=R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b>\u0010W\u001a\u0004\b\r\u0010XR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bY\u0010W\u001a\u0004\b\u000e\u0010XR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b<\u0010W\u001a\u0004\b\u000f\u0010XR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bZ\u0010W\u001a\u0004\b\u0010\u0010XR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b[\u0010W\u001a\u0004\b\u0011\u0010XR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\\\u0010W\u001a\u0004\b]\u0010XR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b^\u0010W\u001a\u0004\b\u0013\u0010XR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b_\u0010W\u001a\u0004\b`\u0010XR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\ba\u0010W\u001a\u0004\bb\u0010XR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bc\u0010G\u001a\u0004\bd\u0010=R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\be\u0010W\u001a\u0004\b\u0017\u0010XR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bR\u0010W\u001a\u0004\bj\u0010XR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bO\u0010W\u001a\u0004\b\u001b\u0010XR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bH\u0010W\u001a\u0004\b\u001c\u0010XR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bj\u0010W\u001a\u0004\bk\u0010XR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bl\u0010W\u001a\u0004\b\u001e\u0010XR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bm\u0010W\u001a\u0004\b\u001f\u0010XR\u0019\u0010 \u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bn\u0010W\u001a\u0004\b \u0010XR\u0019\u0010!\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bo\u0010W\u001a\u0004\b!\u0010XR\u0019\u0010\"\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bp\u0010W\u001a\u0004\b\"\u0010XR\u001f\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#8\u0006¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\be\u0010sR\u0019\u0010&\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bt\u0010W\u001a\u0004\b&\u0010XR\u0019\u0010(\u001a\u0004\u0018\u00010'8\u0006¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR\u0019\u0010)\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\by\u0010W\u001a\u0004\b)\u0010XR\u0019\u0010*\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bz\u0010W\u001a\u0004\b*\u0010XR\u0019\u0010,\u001a\u0004\u0018\u00010+8\u0006¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R\u0019\u0010-\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u007f\u0010W\u001a\u0004\b-\u0010XR\u001a\u0010.\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\r\n\u0005\b\u0080\u0001\u0010W\u001a\u0004\b.\u0010XR\u001a\u0010/\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\r\n\u0005\b\u0081\u0001\u0010W\u001a\u0004\b/\u0010XR\u001a\u00100\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\r\n\u0005\b\u0082\u0001\u0010W\u001a\u0004\b0\u0010XR\u001b\u00101\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010N\u001a\u0005\b\u0084\u0001\u0010PR\u001b\u00102\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010N\u001a\u0005\b\u0086\u0001\u0010PR\u001a\u00103\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\r\n\u0005\b\u0087\u0001\u0010W\u001a\u0004\b3\u0010XR\u001d\u00105\u001a\u0004\u0018\u0001048\u0006¢\u0006\u0010\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001b\u00106\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010W\u001a\u0005\b\u008d\u0001\u0010XR\u001d\u00107\u001a\u0004\u0018\u0001048\u0006¢\u0006\u0010\n\u0006\b\u008e\u0001\u0010\u0089\u0001\u001a\u0006\b\u008f\u0001\u0010\u008b\u0001R\u001b\u00108\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000e\n\u0005\b\u0090\u0001\u0010N\u001a\u0005\b\u0091\u0001\u0010PR\u001b\u00109\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010G\u001a\u0005\b\u0093\u0001\u0010=R\"\u0010\u0095\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020#8\u0000X\u0080\u0004¢\u0006\r\n\u0005\b\u0094\u0001\u0010r\u001a\u0004\bf\u0010sR#\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020#8\u0000X\u0080\u0004¢\u0006\u000e\n\u0005\b\u0096\u0001\u0010r\u001a\u0005\b\u0097\u0001\u0010sR\u001c\u0010\u009a\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020#8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0099\u0001\u0010r¨\u0006\u009c\u0001"}, d2 = {"LAo/W$b;", "", "", "Lcom/meijer/mobile/core/models/products/ProductCode;", "upc", "productSubstitutedUpc", "backupProductUpc", "", "quantity", "price", "sumTotal", "department", "", "isAlcohol", "isSuccess", "isBuyAgain", "isOutOfStock", "isBackup", "itemSelectedFromRecommendation", "isLowStock", "doNotSubstitute", "providedByRecommendations", "pageType", "isOutOfStockItemRemoved", "Lej/a;", "discountDetails", "isSubstitution", "isSubstitutionComplete", "isSubstitutionFindSimilar", "addingFindSimilarSubToCart", "isBopasPlacedOrder", "isBopasEligibleCart", "isSponsoredCriteo", "isAddedFromPlp", "isTrackCartRemoval", "", "LOk/f;", "coupons", "isCouponApplied", "LAo/W$a;", "complexPromo", "isLowStockItemAdded", "isLowStockItemRemoved", "LHo/a;", "sponsorship", "isCarouselSponsoredAdded", "isCarouselSponsored", "isPreOrderEBTOrder", "isPostOrderEBTOrder", "orderEbtEligibleTotal", "ebtCapturedAmount", "isEZCDOrder", "", "qtyRequestedAvailableItemTL", "returnedUnavailableItems", "qtyRequestedOOSItemTL", "qtyAddedFromAddAllButtonTL", "variantsInteracted", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lej/a;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;LAo/W$a;Ljava/lang/Boolean;Ljava/lang/Boolean;LHo/a;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;)V", "j", "()Ljava/lang/String;", "h", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lej/a;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;LAo/W$a;Ljava/lang/Boolean;Ljava/lang/Boolean;LHo/a;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;)LAo/W$b;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "v", "b", "getProductSubstitutedUpc", "c", "getBackupProductUpc", "d", "Ljava/lang/Double;", "u", "()Ljava/lang/Double;", "e", "t", "f", "getSumTotal", "g", "getDepartment", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "i", "k", "l", "m", "getItemSelectedFromRecommendation", "n", "o", "getDoNotSubstitute", "p", "getProvidedByRecommendations", "q", "getPageType", "r", "s", "Lej/a;", "getDiscountDetails", "()Lej/a;", "w", "getAddingFindSimilarSubToCart", "x", "y", "z", "A", "B", "C", "Ljava/util/List;", "()Ljava/util/List;", "D", "E", "LAo/W$a;", "getComplexPromo", "()LAo/W$a;", "F", "G", "H", "LHo/a;", "getSponsorship", "()LHo/a;", "I", "J", "K", "L", "M", "getOrderEbtEligibleTotal", "N", "getEbtCapturedAmount", "O", "P", "Ljava/lang/Integer;", "getQtyRequestedAvailableItemTL", "()Ljava/lang/Integer;", "Q", "getReturnedUnavailableItems", "R", "getQtyRequestedOOSItemTL", "S", "getQtyAddedFromAddAllButtonTL", "T", "getVariantsInteracted", "U", "eventsList", "V", "getEvents$analytics_release", "events", "W", "eVars", "X", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Ao.W$b, reason: from toString */
    public static final /* data */ class Details {

        /* renamed from: X, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: A, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isAddedFromPlp;

        /* renamed from: B, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isTrackCartRemoval;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Ok.f> coupons;

        /* renamed from: D, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isCouponApplied;

        /* renamed from: E, reason: collision with root package name and from kotlin metadata and from toString */
        private final ComplexPromo complexPromo;

        /* renamed from: F, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isLowStockItemAdded;

        /* renamed from: G, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isLowStockItemRemoved;

        /* renamed from: H, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProductSponsorship sponsorship;

        /* renamed from: I, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isCarouselSponsoredAdded;

        /* renamed from: J, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isCarouselSponsored;

        /* renamed from: K, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isPreOrderEBTOrder;

        /* renamed from: L, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isPostOrderEBTOrder;

        /* renamed from: M, reason: collision with root package name and from kotlin metadata and from toString */
        private final Double orderEbtEligibleTotal;

        /* renamed from: N, reason: collision with root package name and from kotlin metadata and from toString */
        private final Double ebtCapturedAmount;

        /* renamed from: O, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isEZCDOrder;

        /* renamed from: P, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer qtyRequestedAvailableItemTL;

        /* renamed from: Q, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean returnedUnavailableItems;

        /* renamed from: R, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer qtyRequestedOOSItemTL;

        /* renamed from: S, reason: collision with root package name and from kotlin metadata and from toString */
        private final Double qtyAddedFromAddAllButtonTL;

        /* renamed from: T, reason: collision with root package name and from kotlin metadata and from toString */
        private final String variantsInteracted;

        /* renamed from: U, reason: collision with root package name and from kotlin metadata */
        private final List<String> eventsList;

        /* renamed from: V, reason: collision with root package name and from kotlin metadata */
        private final List<String> events;

        /* renamed from: W, reason: collision with root package name and from kotlin metadata */
        private final List<String> eVars;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String upc;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String productSubstitutedUpc;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String backupProductUpc;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Double quantity;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Double price;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final Double sumTotal;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String department;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isAlcohol;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isSuccess;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isBuyAgain;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isOutOfStock;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isBackup;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean itemSelectedFromRecommendation;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isLowStock;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean doNotSubstitute;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean providedByRecommendations;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final String pageType;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isOutOfStockItemRemoved;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        private final AllDiscountDetails discountDetails;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isSubstitution;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isSubstitutionComplete;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isSubstitutionFindSimilar;

        /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean addingFindSimilarSubToCart;

        /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isBopasPlacedOrder;

        /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isBopasEligibleCart;

        /* renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isSponsoredCriteo;

        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0093\u0001\u0010\u001a\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010 \u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"LAo/W$b$a;", "", "<init>", "()V", "", "Lej/j;", "entryChanges", "", "pageType", "LAo/W$b;", "c", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "entryChange", "LAo/W$a;", "complexPromo", "LOk/f;", "coupons", "", "isCouponApplied", "LHo/a;", "sponsorship", "isBuyAgain", "isSponsoredCriteo", "isAddedFromPlp", "isTrackCartRemoval", "variantsInteracted", "b", "(Lej/j;Ljava/lang/String;LAo/W$a;Ljava/util/List;Ljava/lang/Boolean;LHo/a;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)LAo/W$b;", "LCo/h;", "product", "", "quantity", "a", "(LCo/h;Ljava/lang/Double;)LAo/W$b;", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Ao.W$b$a, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final Ao.W.Details b(ej.EntryChange r60, java.lang.String r61, Ao.W.ComplexPromo r62, java.util.List<? extends Ok.f> r63, java.lang.Boolean r64, Ho.ProductSponsorship r65, java.lang.Boolean r66, java.lang.Boolean r67, java.lang.Boolean r68, java.lang.Boolean r69, java.lang.String r70) {
                /*
                    Method dump skipped, instructions count: 322
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: Ao.W.Details.Companion.b(ej.j, java.lang.String, Ao.W$a, java.util.List, java.lang.Boolean, Ho.a, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String):Ao.W$b");
            }

            private Companion() {
            }

            public static /* synthetic */ Details d(Companion companion, ProductFullDetails productFullDetails, Double d10, int i10, Object obj) {
                if ((i10 & 2) != 0) {
                    d10 = null;
                }
                return companion.a(productFullDetails, d10);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Details e(Companion companion, EntryChange entryChange, String str, ComplexPromo complexPromo, List list, Boolean bool, ProductSponsorship productSponsorship, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str2, int i10, Object obj) {
                if ((i10 & 4) != 0) {
                    complexPromo = null;
                }
                if ((i10 & 8) != 0) {
                    list = null;
                }
                if ((i10 & 16) != 0) {
                    bool = null;
                }
                if ((i10 & 32) != 0) {
                    productSponsorship = null;
                }
                if ((i10 & 64) != 0) {
                    bool2 = null;
                }
                if ((i10 & 128) != 0) {
                    bool3 = null;
                }
                if ((i10 & 256) != 0) {
                    bool4 = null;
                }
                if ((i10 & 512) != 0) {
                    bool5 = null;
                }
                if ((i10 & 1024) != 0) {
                    str2 = null;
                }
                return companion.b(entryChange, str, complexPromo, list, bool, productSponsorship, bool2, bool3, bool4, bool5, str2);
            }

            public final Details a(ProductFullDetails product, Double quantity) {
                mk.b bVarD;
                return new Details(product != null ? product.getCode() : null, null, null, quantity, (product == null || (bVarD = product.D()) == null) ? null : Double.valueOf(bVarD.getValue()), null, product != null ? product.getDepartment() : null, product != null ? Boolean.valueOf(product.getIsAlcohol()) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -66010, 16383, null);
            }

            public final List<Details> c(List<EntryChange> entryChanges, String pageType) {
                Intrinsics.j(entryChanges, "entryChanges");
                List<EntryChange> list = entryChanges;
                ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(e(Details.INSTANCE, (EntryChange) it.next(), pageType, null, null, null, null, null, null, null, null, null, 2044, null));
                }
                return arrayList;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:106:0x01ad  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x01c8  */
        /* JADX WARN: Removed duplicated region for block: B:143:0x0235  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00d6  */
        /* JADX WARN: Removed duplicated region for block: B:172:0x0299  */
        /* JADX WARN: Removed duplicated region for block: B:181:0x02ae  */
        /* JADX WARN: Removed duplicated region for block: B:190:0x02c3  */
        /* JADX WARN: Removed duplicated region for block: B:199:0x02d8  */
        /* JADX WARN: Removed duplicated region for block: B:214:0x0304  */
        /* JADX WARN: Removed duplicated region for block: B:223:0x0319  */
        /* JADX WARN: Removed duplicated region for block: B:232:0x032e  */
        /* JADX WARN: Removed duplicated region for block: B:241:0x035f  */
        /* JADX WARN: Removed duplicated region for block: B:250:0x0393  */
        /* JADX WARN: Removed duplicated region for block: B:259:0x03a9  */
        /* JADX WARN: Removed duplicated region for block: B:269:0x03d3  */
        /* JADX WARN: Removed duplicated region for block: B:288:0x043e  */
        /* JADX WARN: Removed duplicated region for block: B:297:0x0450  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00f4  */
        /* JADX WARN: Removed duplicated region for block: B:306:0x0462  */
        /* JADX WARN: Removed duplicated region for block: B:315:0x0485  */
        /* JADX WARN: Removed duplicated region for block: B:326:0x049b  */
        /* JADX WARN: Removed duplicated region for block: B:337:0x04b5  */
        /* JADX WARN: Removed duplicated region for block: B:346:0x04da  */
        /* JADX WARN: Removed duplicated region for block: B:355:0x0511  */
        /* JADX WARN: Removed duplicated region for block: B:364:0x0545  */
        /* JADX WARN: Removed duplicated region for block: B:373:0x0559  */
        /* JADX WARN: Removed duplicated region for block: B:382:0x058b  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:391:0x05bd  */
        /* JADX WARN: Removed duplicated region for block: B:401:0x05f9  */
        /* JADX WARN: Removed duplicated region for block: B:420:0x064b  */
        /* JADX WARN: Removed duplicated region for block: B:428:0x0668  */
        /* JADX WARN: Removed duplicated region for block: B:438:0x069d  */
        /* JADX WARN: Removed duplicated region for block: B:445:0x06c7  */
        /* JADX WARN: Removed duplicated region for block: B:454:0x06f9  */
        /* JADX WARN: Removed duplicated region for block: B:461:0x0723  */
        /* JADX WARN: Removed duplicated region for block: B:470:0x0767  */
        /* JADX WARN: Removed duplicated region for block: B:488:0x07d7  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0122  */
        /* JADX WARN: Removed duplicated region for block: B:501:0x0808  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x013c  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x016c  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0183  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0198  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Details(java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.Double r24, java.lang.Double r25, java.lang.Double r26, java.lang.String r27, java.lang.Boolean r28, java.lang.Boolean r29, java.lang.Boolean r30, java.lang.Boolean r31, java.lang.Boolean r32, java.lang.Boolean r33, java.lang.Boolean r34, java.lang.Boolean r35, java.lang.Boolean r36, java.lang.String r37, java.lang.Boolean r38, ej.AllDiscountDetails r39, java.lang.Boolean r40, java.lang.Boolean r41, java.lang.Boolean r42, java.lang.Boolean r43, java.lang.Boolean r44, java.lang.Boolean r45, java.lang.Boolean r46, java.lang.Boolean r47, java.lang.Boolean r48, java.util.List<? extends Ok.f> r49, java.lang.Boolean r50, Ao.W.ComplexPromo r51, java.lang.Boolean r52, java.lang.Boolean r53, Ho.ProductSponsorship r54, java.lang.Boolean r55, java.lang.Boolean r56, java.lang.Boolean r57, java.lang.Boolean r58, java.lang.Double r59, java.lang.Double r60, java.lang.Boolean r61, java.lang.Integer r62, java.lang.Boolean r63, java.lang.Integer r64, java.lang.Double r65, java.lang.String r66) {
            /*
                Method dump skipped, instructions count: 2156
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Ao.W.Details.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Boolean, ej.a, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.util.List, java.lang.Boolean, Ao.W$a, java.lang.Boolean, java.lang.Boolean, Ho.a, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Double, java.lang.Double, java.lang.Boolean, java.lang.Integer, java.lang.Boolean, java.lang.Integer, java.lang.Double, java.lang.String):void");
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Details)) {
                return false;
            }
            Details details = (Details) other;
            return Intrinsics.e(this.upc, details.upc) && Intrinsics.e(this.productSubstitutedUpc, details.productSubstitutedUpc) && Intrinsics.e(this.backupProductUpc, details.backupProductUpc) && Intrinsics.e(this.quantity, details.quantity) && Intrinsics.e(this.price, details.price) && Intrinsics.e(this.sumTotal, details.sumTotal) && Intrinsics.e(this.department, details.department) && Intrinsics.e(this.isAlcohol, details.isAlcohol) && Intrinsics.e(this.isSuccess, details.isSuccess) && Intrinsics.e(this.isBuyAgain, details.isBuyAgain) && Intrinsics.e(this.isOutOfStock, details.isOutOfStock) && Intrinsics.e(this.isBackup, details.isBackup) && Intrinsics.e(this.itemSelectedFromRecommendation, details.itemSelectedFromRecommendation) && Intrinsics.e(this.isLowStock, details.isLowStock) && Intrinsics.e(this.doNotSubstitute, details.doNotSubstitute) && Intrinsics.e(this.providedByRecommendations, details.providedByRecommendations) && Intrinsics.e(this.pageType, details.pageType) && Intrinsics.e(this.isOutOfStockItemRemoved, details.isOutOfStockItemRemoved) && Intrinsics.e(this.discountDetails, details.discountDetails) && Intrinsics.e(this.isSubstitution, details.isSubstitution) && Intrinsics.e(this.isSubstitutionComplete, details.isSubstitutionComplete) && Intrinsics.e(this.isSubstitutionFindSimilar, details.isSubstitutionFindSimilar) && Intrinsics.e(this.addingFindSimilarSubToCart, details.addingFindSimilarSubToCart) && Intrinsics.e(this.isBopasPlacedOrder, details.isBopasPlacedOrder) && Intrinsics.e(this.isBopasEligibleCart, details.isBopasEligibleCart) && Intrinsics.e(this.isSponsoredCriteo, details.isSponsoredCriteo) && Intrinsics.e(this.isAddedFromPlp, details.isAddedFromPlp) && Intrinsics.e(this.isTrackCartRemoval, details.isTrackCartRemoval) && Intrinsics.e(this.coupons, details.coupons) && Intrinsics.e(this.isCouponApplied, details.isCouponApplied) && Intrinsics.e(this.complexPromo, details.complexPromo) && Intrinsics.e(this.isLowStockItemAdded, details.isLowStockItemAdded) && Intrinsics.e(this.isLowStockItemRemoved, details.isLowStockItemRemoved) && Intrinsics.e(this.sponsorship, details.sponsorship) && Intrinsics.e(this.isCarouselSponsoredAdded, details.isCarouselSponsoredAdded) && Intrinsics.e(this.isCarouselSponsored, details.isCarouselSponsored) && Intrinsics.e(this.isPreOrderEBTOrder, details.isPreOrderEBTOrder) && Intrinsics.e(this.isPostOrderEBTOrder, details.isPostOrderEBTOrder) && Intrinsics.e(this.orderEbtEligibleTotal, details.orderEbtEligibleTotal) && Intrinsics.e(this.ebtCapturedAmount, details.ebtCapturedAmount) && Intrinsics.e(this.isEZCDOrder, details.isEZCDOrder) && Intrinsics.e(this.qtyRequestedAvailableItemTL, details.qtyRequestedAvailableItemTL) && Intrinsics.e(this.returnedUnavailableItems, details.returnedUnavailableItems) && Intrinsics.e(this.qtyRequestedOOSItemTL, details.qtyRequestedOOSItemTL) && Intrinsics.e(this.qtyAddedFromAddAllButtonTL, details.qtyAddedFromAddAllButtonTL) && Intrinsics.e(this.variantsInteracted, details.variantsInteracted);
        }

        public final Details h(String upc, String productSubstitutedUpc, String backupProductUpc, Double quantity, Double price, Double sumTotal, String department, Boolean isAlcohol, Boolean isSuccess, Boolean isBuyAgain, Boolean isOutOfStock, Boolean isBackup, Boolean itemSelectedFromRecommendation, Boolean isLowStock, Boolean doNotSubstitute, Boolean providedByRecommendations, String pageType, Boolean isOutOfStockItemRemoved, AllDiscountDetails discountDetails, Boolean isSubstitution, Boolean isSubstitutionComplete, Boolean isSubstitutionFindSimilar, Boolean addingFindSimilarSubToCart, Boolean isBopasPlacedOrder, Boolean isBopasEligibleCart, Boolean isSponsoredCriteo, Boolean isAddedFromPlp, Boolean isTrackCartRemoval, List<? extends Ok.f> coupons, Boolean isCouponApplied, ComplexPromo complexPromo, Boolean isLowStockItemAdded, Boolean isLowStockItemRemoved, ProductSponsorship sponsorship, Boolean isCarouselSponsoredAdded, Boolean isCarouselSponsored, Boolean isPreOrderEBTOrder, Boolean isPostOrderEBTOrder, Double orderEbtEligibleTotal, Double ebtCapturedAmount, Boolean isEZCDOrder, Integer qtyRequestedAvailableItemTL, Boolean returnedUnavailableItems, Integer qtyRequestedOOSItemTL, Double qtyAddedFromAddAllButtonTL, String variantsInteracted) {
            return new Details(upc, productSubstitutedUpc, backupProductUpc, quantity, price, sumTotal, department, isAlcohol, isSuccess, isBuyAgain, isOutOfStock, isBackup, itemSelectedFromRecommendation, isLowStock, doNotSubstitute, providedByRecommendations, pageType, isOutOfStockItemRemoved, discountDetails, isSubstitution, isSubstitutionComplete, isSubstitutionFindSimilar, addingFindSimilarSubToCart, isBopasPlacedOrder, isBopasEligibleCart, isSponsoredCriteo, isAddedFromPlp, isTrackCartRemoval, coupons, isCouponApplied, complexPromo, isLowStockItemAdded, isLowStockItemRemoved, sponsorship, isCarouselSponsoredAdded, isCarouselSponsored, isPreOrderEBTOrder, isPostOrderEBTOrder, orderEbtEligibleTotal, ebtCapturedAmount, isEZCDOrder, qtyRequestedAvailableItemTL, returnedUnavailableItems, qtyRequestedOOSItemTL, qtyAddedFromAddAllButtonTL, variantsInteracted);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence k(PromoDiscount it) {
            Intrinsics.j(it, "it");
            return new Regex("[,;|]").k(String.valueOf(it.getPromoDesc()), "");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double l() {
            return 0.0d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double m() {
            return 0.0d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double n() {
            return 0.0d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double o() {
            return 0.0d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double p() {
            return 0.0d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double q() {
            return 0.0d;
        }

        public int hashCode() {
            String str = this.upc;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.productSubstitutedUpc;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.backupProductUpc;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Double d10 = this.quantity;
            int iHashCode4 = (iHashCode3 + (d10 == null ? 0 : d10.hashCode())) * 31;
            Double d11 = this.price;
            int iHashCode5 = (iHashCode4 + (d11 == null ? 0 : d11.hashCode())) * 31;
            Double d12 = this.sumTotal;
            int iHashCode6 = (iHashCode5 + (d12 == null ? 0 : d12.hashCode())) * 31;
            String str4 = this.department;
            int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Boolean bool = this.isAlcohol;
            int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isSuccess;
            int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.isBuyAgain;
            int iHashCode10 = (iHashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.isOutOfStock;
            int iHashCode11 = (iHashCode10 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Boolean bool5 = this.isBackup;
            int iHashCode12 = (iHashCode11 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            Boolean bool6 = this.itemSelectedFromRecommendation;
            int iHashCode13 = (iHashCode12 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
            Boolean bool7 = this.isLowStock;
            int iHashCode14 = (iHashCode13 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
            Boolean bool8 = this.doNotSubstitute;
            int iHashCode15 = (iHashCode14 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
            Boolean bool9 = this.providedByRecommendations;
            int iHashCode16 = (iHashCode15 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
            String str5 = this.pageType;
            int iHashCode17 = (iHashCode16 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Boolean bool10 = this.isOutOfStockItemRemoved;
            int iHashCode18 = (iHashCode17 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
            AllDiscountDetails allDiscountDetails = this.discountDetails;
            int iHashCode19 = (iHashCode18 + (allDiscountDetails == null ? 0 : allDiscountDetails.hashCode())) * 31;
            Boolean bool11 = this.isSubstitution;
            int iHashCode20 = (iHashCode19 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
            Boolean bool12 = this.isSubstitutionComplete;
            int iHashCode21 = (iHashCode20 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
            Boolean bool13 = this.isSubstitutionFindSimilar;
            int iHashCode22 = (iHashCode21 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
            Boolean bool14 = this.addingFindSimilarSubToCart;
            int iHashCode23 = (iHashCode22 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
            Boolean bool15 = this.isBopasPlacedOrder;
            int iHashCode24 = (iHashCode23 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
            Boolean bool16 = this.isBopasEligibleCart;
            int iHashCode25 = (iHashCode24 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
            Boolean bool17 = this.isSponsoredCriteo;
            int iHashCode26 = (iHashCode25 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
            Boolean bool18 = this.isAddedFromPlp;
            int iHashCode27 = (iHashCode26 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
            Boolean bool19 = this.isTrackCartRemoval;
            int iHashCode28 = (iHashCode27 + (bool19 == null ? 0 : bool19.hashCode())) * 31;
            List<Ok.f> list = this.coupons;
            int iHashCode29 = (iHashCode28 + (list == null ? 0 : list.hashCode())) * 31;
            Boolean bool20 = this.isCouponApplied;
            int iHashCode30 = (iHashCode29 + (bool20 == null ? 0 : bool20.hashCode())) * 31;
            ComplexPromo complexPromo = this.complexPromo;
            int iHashCode31 = (iHashCode30 + (complexPromo == null ? 0 : complexPromo.hashCode())) * 31;
            Boolean bool21 = this.isLowStockItemAdded;
            int iHashCode32 = (iHashCode31 + (bool21 == null ? 0 : bool21.hashCode())) * 31;
            Boolean bool22 = this.isLowStockItemRemoved;
            int iHashCode33 = (iHashCode32 + (bool22 == null ? 0 : bool22.hashCode())) * 31;
            ProductSponsorship productSponsorship = this.sponsorship;
            int iHashCode34 = (iHashCode33 + (productSponsorship == null ? 0 : productSponsorship.hashCode())) * 31;
            Boolean bool23 = this.isCarouselSponsoredAdded;
            int iHashCode35 = (iHashCode34 + (bool23 == null ? 0 : bool23.hashCode())) * 31;
            Boolean bool24 = this.isCarouselSponsored;
            int iHashCode36 = (iHashCode35 + (bool24 == null ? 0 : bool24.hashCode())) * 31;
            Boolean bool25 = this.isPreOrderEBTOrder;
            int iHashCode37 = (iHashCode36 + (bool25 == null ? 0 : bool25.hashCode())) * 31;
            Boolean bool26 = this.isPostOrderEBTOrder;
            int iHashCode38 = (iHashCode37 + (bool26 == null ? 0 : bool26.hashCode())) * 31;
            Double d13 = this.orderEbtEligibleTotal;
            int iHashCode39 = (iHashCode38 + (d13 == null ? 0 : d13.hashCode())) * 31;
            Double d14 = this.ebtCapturedAmount;
            int iHashCode40 = (iHashCode39 + (d14 == null ? 0 : d14.hashCode())) * 31;
            Boolean bool27 = this.isEZCDOrder;
            int iHashCode41 = (iHashCode40 + (bool27 == null ? 0 : bool27.hashCode())) * 31;
            Integer num = this.qtyRequestedAvailableItemTL;
            int iHashCode42 = (iHashCode41 + (num == null ? 0 : num.hashCode())) * 31;
            Boolean bool28 = this.returnedUnavailableItems;
            int iHashCode43 = (iHashCode42 + (bool28 == null ? 0 : bool28.hashCode())) * 31;
            Integer num2 = this.qtyRequestedOOSItemTL;
            int iHashCode44 = (iHashCode43 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Double d15 = this.qtyAddedFromAddAllButtonTL;
            int iHashCode45 = (iHashCode44 + (d15 == null ? 0 : d15.hashCode())) * 31;
            String str6 = this.variantsInteracted;
            return iHashCode45 + (str6 != null ? str6.hashCode() : 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String j() {
            /*
                r17 = this;
                r0 = r17
                java.lang.String r1 = r0.department
                java.lang.String r2 = ""
                if (r1 != 0) goto La
                r3 = r2
                goto Lb
            La:
                r3 = r1
            Lb:
                java.lang.Boolean r1 = r0.isSubstitutionComplete
                java.lang.Boolean r4 = java.lang.Boolean.TRUE
                boolean r1 = kotlin.jvm.internal.Intrinsics.e(r1, r4)
                if (r1 == 0) goto L19
                java.lang.String r1 = r0.productSubstitutedUpc
            L17:
                r4 = r1
                goto L1e
            L19:
                java.lang.String r1 = r0.upc
                if (r1 != 0) goto L17
                r4 = r2
            L1e:
                java.lang.Double r1 = r0.quantity
                r5 = 0
                if (r1 == 0) goto L28
                java.lang.String r1 = r1.toString()
                goto L29
            L28:
                r1 = r5
            L29:
                if (r1 != 0) goto L2c
                r1 = r2
            L2c:
                java.lang.Double r6 = r0.price
                if (r6 == 0) goto L34
                java.lang.String r5 = r6.toString()
            L34:
                if (r5 != 0) goto L38
                r6 = r2
                goto L39
            L38:
                r6 = r5
            L39:
                java.util.List<java.lang.String> r2 = r0.events
                r7 = r2
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                r14 = 62
                r15 = 0
                java.lang.String r8 = "|"
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                java.lang.String r7 = kotlin.collections.CollectionsKt.B0(r7, r8, r9, r10, r11, r12, r13, r14, r15)
                java.util.List<java.lang.String> r2 = r0.eVars
                r8 = r2
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                r15 = 62
                r16 = 0
                java.lang.String r9 = "|"
                r11 = 0
                r12 = 0
                r14 = 0
                java.lang.String r8 = kotlin.collections.CollectionsKt.B0(r8, r9, r10, r11, r12, r13, r14, r15, r16)
                r5 = r1
                java.lang.String[] r1 = new java.lang.String[]{r3, r4, r5, r6, r7, r8}
                java.util.List r1 = kotlin.collections.CollectionsKt.p(r1)
                r2 = r1
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                r9 = 62
                java.lang.String r3 = ";"
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                java.lang.String r1 = kotlin.collections.CollectionsKt.B0(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: Ao.W.Details.j():java.lang.String");
        }

        public final List<Ok.f> r() {
            return this.coupons;
        }

        public final List<String> s() {
            return this.eventsList;
        }

        /* renamed from: t, reason: from getter */
        public final Double getPrice() {
            return this.price;
        }

        public String toString() {
            return "Details(upc=" + this.upc + ", productSubstitutedUpc=" + this.productSubstitutedUpc + ", backupProductUpc=" + this.backupProductUpc + ", quantity=" + this.quantity + ", price=" + this.price + ", sumTotal=" + this.sumTotal + ", department=" + this.department + ", isAlcohol=" + this.isAlcohol + ", isSuccess=" + this.isSuccess + ", isBuyAgain=" + this.isBuyAgain + ", isOutOfStock=" + this.isOutOfStock + ", isBackup=" + this.isBackup + ", itemSelectedFromRecommendation=" + this.itemSelectedFromRecommendation + ", isLowStock=" + this.isLowStock + ", doNotSubstitute=" + this.doNotSubstitute + ", providedByRecommendations=" + this.providedByRecommendations + ", pageType=" + this.pageType + ", isOutOfStockItemRemoved=" + this.isOutOfStockItemRemoved + ", discountDetails=" + this.discountDetails + ", isSubstitution=" + this.isSubstitution + ", isSubstitutionComplete=" + this.isSubstitutionComplete + ", isSubstitutionFindSimilar=" + this.isSubstitutionFindSimilar + ", addingFindSimilarSubToCart=" + this.addingFindSimilarSubToCart + ", isBopasPlacedOrder=" + this.isBopasPlacedOrder + ", isBopasEligibleCart=" + this.isBopasEligibleCart + ", isSponsoredCriteo=" + this.isSponsoredCriteo + ", isAddedFromPlp=" + this.isAddedFromPlp + ", isTrackCartRemoval=" + this.isTrackCartRemoval + ", coupons=" + this.coupons + ", isCouponApplied=" + this.isCouponApplied + ", complexPromo=" + this.complexPromo + ", isLowStockItemAdded=" + this.isLowStockItemAdded + ", isLowStockItemRemoved=" + this.isLowStockItemRemoved + ", sponsorship=" + this.sponsorship + ", isCarouselSponsoredAdded=" + this.isCarouselSponsoredAdded + ", isCarouselSponsored=" + this.isCarouselSponsored + ", isPreOrderEBTOrder=" + this.isPreOrderEBTOrder + ", isPostOrderEBTOrder=" + this.isPostOrderEBTOrder + ", orderEbtEligibleTotal=" + this.orderEbtEligibleTotal + ", ebtCapturedAmount=" + this.ebtCapturedAmount + ", isEZCDOrder=" + this.isEZCDOrder + ", qtyRequestedAvailableItemTL=" + this.qtyRequestedAvailableItemTL + ", returnedUnavailableItems=" + this.returnedUnavailableItems + ", qtyRequestedOOSItemTL=" + this.qtyRequestedOOSItemTL + ", qtyAddedFromAddAllButtonTL=" + this.qtyAddedFromAddAllButtonTL + ", variantsInteracted=" + this.variantsInteracted + ')';
        }

        /* renamed from: u, reason: from getter */
        public final Double getQuantity() {
            return this.quantity;
        }

        /* renamed from: v, reason: from getter */
        public final String getUpc() {
            return this.upc;
        }

        /* renamed from: w, reason: from getter */
        public final Boolean getIsSubstitution() {
            return this.isSubstitution;
        }

        public /* synthetic */ Details(String str, String str2, String str3, Double d10, Double d11, Double d12, String str4, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, String str5, Boolean bool10, AllDiscountDetails allDiscountDetails, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, List list, Boolean bool20, ComplexPromo complexPromo, Boolean bool21, Boolean bool22, ProductSponsorship productSponsorship, Boolean bool23, Boolean bool24, Boolean bool25, Boolean bool26, Double d13, Double d14, Boolean bool27, Integer num, Boolean bool28, Integer num2, Double d15, String str6, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, d10, (i10 & 16) != 0 ? null : d11, (i10 & 32) != 0 ? null : d12, (i10 & 64) != 0 ? null : str4, (i10 & 128) != 0 ? null : bool, (i10 & 256) != 0 ? null : bool2, (i10 & 512) != 0 ? null : bool3, (i10 & 1024) != 0 ? null : bool4, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? null : bool5, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : bool6, (i10 & 8192) != 0 ? null : bool7, (i10 & 16384) != 0 ? null : bool8, (32768 & i10) != 0 ? null : bool9, (65536 & i10) != 0 ? null : str5, (131072 & i10) != 0 ? null : bool10, (262144 & i10) != 0 ? null : allDiscountDetails, (524288 & i10) != 0 ? null : bool11, (1048576 & i10) != 0 ? null : bool12, (2097152 & i10) != 0 ? null : bool13, (4194304 & i10) != 0 ? null : bool14, (8388608 & i10) != 0 ? null : bool15, (16777216 & i10) != 0 ? null : bool16, (33554432 & i10) != 0 ? null : bool17, (67108864 & i10) != 0 ? null : bool18, (134217728 & i10) != 0 ? null : bool19, (268435456 & i10) != 0 ? null : list, (536870912 & i10) != 0 ? null : bool20, (1073741824 & i10) != 0 ? null : complexPromo, (i10 & Integer.MIN_VALUE) != 0 ? null : bool21, (i11 & 1) != 0 ? null : bool22, (i11 & 2) != 0 ? null : productSponsorship, (i11 & 4) != 0 ? null : bool23, (i11 & 8) != 0 ? null : bool24, (i11 & 16) != 0 ? null : bool25, (i11 & 32) != 0 ? null : bool26, (i11 & 64) != 0 ? null : d13, (i11 & 128) != 0 ? null : d14, (i11 & 256) != 0 ? null : bool27, (i11 & 512) != 0 ? null : num, (i11 & 1024) != 0 ? null : bool28, (i11 & RecyclerView.m.FLAG_MOVED) != 0 ? null : num2, (i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : d15, (i11 & 8192) != 0 ? null : str6);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001d"}, d2 = {"LAo/W$c;", "", "Lmk/i;", "itemAdded", "itemReplaced", "LCo/h;", "itemAddedFullDetails", "itemReplacedFullDetails", "<init>", "(Lmk/i;Lmk/i;LCo/h;LCo/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmk/i;", "()Lmk/i;", "b", "c", "LCo/h;", "()LCo/h;", "d", "getItemReplacedFullDetails", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ao.W$c, reason: from toString */
    public static final /* data */ class SubstitutionPair {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final mk.i itemAdded;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final mk.i itemReplaced;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProductFullDetails itemAddedFullDetails;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProductFullDetails itemReplacedFullDetails;

        public SubstitutionPair() {
            this(null, null, null, null, 15, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SubstitutionPair)) {
                return false;
            }
            SubstitutionPair substitutionPair = (SubstitutionPair) other;
            return Intrinsics.e(this.itemAdded, substitutionPair.itemAdded) && Intrinsics.e(this.itemReplaced, substitutionPair.itemReplaced) && Intrinsics.e(this.itemAddedFullDetails, substitutionPair.itemAddedFullDetails) && Intrinsics.e(this.itemReplacedFullDetails, substitutionPair.itemReplacedFullDetails);
        }

        public SubstitutionPair(mk.i iVar, mk.i iVar2, ProductFullDetails productFullDetails, ProductFullDetails productFullDetails2) {
            this.itemAdded = iVar;
            this.itemReplaced = iVar2;
            this.itemAddedFullDetails = productFullDetails;
            this.itemReplacedFullDetails = productFullDetails2;
        }

        /* renamed from: a, reason: from getter */
        public final mk.i getItemAdded() {
            return this.itemAdded;
        }

        /* renamed from: b, reason: from getter */
        public final ProductFullDetails getItemAddedFullDetails() {
            return this.itemAddedFullDetails;
        }

        /* renamed from: c, reason: from getter */
        public final mk.i getItemReplaced() {
            return this.itemReplaced;
        }

        public int hashCode() {
            mk.i iVar = this.itemAdded;
            int iHashCode = (iVar == null ? 0 : iVar.hashCode()) * 31;
            mk.i iVar2 = this.itemReplaced;
            int iHashCode2 = (iHashCode + (iVar2 == null ? 0 : iVar2.hashCode())) * 31;
            ProductFullDetails productFullDetails = this.itemAddedFullDetails;
            int iHashCode3 = (iHashCode2 + (productFullDetails == null ? 0 : productFullDetails.hashCode())) * 31;
            ProductFullDetails productFullDetails2 = this.itemReplacedFullDetails;
            return iHashCode3 + (productFullDetails2 != null ? productFullDetails2.hashCode() : 0);
        }

        public String toString() {
            return "SubstitutionPair(itemAdded=" + this.itemAdded + ", itemReplaced=" + this.itemReplaced + ", itemAddedFullDetails=" + this.itemAddedFullDetails + ", itemReplacedFullDetails=" + this.itemReplacedFullDetails + ')';
        }

        public /* synthetic */ SubstitutionPair(mk.i iVar, mk.i iVar2, ProductFullDetails productFullDetails, ProductFullDetails productFullDetails2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : iVar, (i10 & 2) != 0 ? null : iVar2, (i10 & 4) != 0 ? null : productFullDetails, (i10 & 8) != 0 ? null : productFullDetails2);
        }
    }

    private final String b(String input) throws UnsupportedEncodingException {
        String strEncode = URLEncoder.encode("|", StandardCharsets.UTF_8.toString());
        Intrinsics.i(strEncode, "encode(...)");
        return StringsKt.Q(input, "|", strEncode, false, 4, null);
    }

    @JvmStatic
    public static final AbstractC14482i.Extra c(List<Details> detailItems) {
        Intrinsics.j(detailItems, "detailItems");
        ArrayList arrayList = new ArrayList();
        for (Object obj : detailItems) {
            if (((Details) obj).getQuantity() != null) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            Double quantity = ((Details) it.next()).getQuantity();
            dDoubleValue += quantity != null ? quantity.doubleValue() : 0.0d;
        }
        return C14476c.b("Cart Items Count", String.valueOf(dDoubleValue));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence e(Details item) {
        Intrinsics.j(item, "item");
        return item.j();
    }

    @JvmStatic
    public static final AbstractC14482i[] i(Details detailItem) {
        Intrinsics.j(detailItem, "detailItem");
        return j(CollectionsKt.e(detailItem));
    }

    @JvmStatic
    public static final AbstractC14482i[] j(List<Details> detailItems) {
        AbstractC14482i.Extra extraK;
        List<Ok.f> listR;
        String strB0;
        Intrinsics.j(detailItems, "detailItems");
        AbstractC14482i.Extra extraD = f1200a.d(detailItems);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = detailItems.iterator();
        while (it.hasNext()) {
            CollectionsKt.C(arrayList, ((Details) it.next()).s());
        }
        List listI0 = CollectionsKt.i0(arrayList);
        AbstractC14482i abstractC14482iF = null;
        if (listI0.isEmpty()) {
            listI0 = null;
        }
        AbstractC14482i.Extra extraB = (listI0 == null || (strB0 = CollectionsKt.B0(listI0, ",", null, null, 0, null, null, 62, null)) == null) ? null : C14476c.b("&&events", strB0);
        AbstractC14482i.Extra extraG = (detailItems.size() != 1 || Intrinsics.e(((Details) CollectionsKt.s0(detailItems)).getIsSubstitution(), Boolean.TRUE)) ? null : f1200a.g(((Details) CollectionsKt.s0(detailItems)).getUpc());
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : detailItems) {
            if (((Details) obj).getQuantity() != null) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = null;
        }
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            double dDoubleValue = 0.0d;
            while (it2.hasNext()) {
                Double quantity = ((Details) it2.next()).getQuantity();
                dDoubleValue += quantity != null ? quantity.doubleValue() : 0.0d;
            }
            extraK = f1200a.k(Double.valueOf(dDoubleValue));
        } else {
            extraK = null;
        }
        Details details = (Details) CollectionsKt.u0(detailItems);
        if (details != null && (listR = details.r()) != null) {
            if (listR.isEmpty()) {
                listR = null;
            }
            if (listR != null) {
                abstractC14482iF = Qk.b.f30831a.f(listR);
            }
        }
        return (AbstractC14482i[]) CollectionsKt.r(extraD, extraB, extraG, extraK, abstractC14482iF).toArray(new AbstractC14482i[0]);
    }

    @JvmStatic
    public static final AbstractC14482i[] l(List<Details> detailItems, int truncationLimit) {
        boolean z10;
        Intrinsics.j(detailItems, "detailItems");
        StringBuilder sb2 = new StringBuilder();
        Iterator<T> it = detailItems.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            }
            Object next = it.next();
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.w();
            }
            Details details = (Details) next;
            String upc = details.getUpc();
            if (upc == null) {
                upc = "";
            }
            Double quantity = details.getQuantity();
            String string = quantity != null ? quantity.toString() : null;
            if (string == null) {
                string = "";
            }
            Double price = details.getPrice();
            String string2 = price != null ? price.toString() : null;
            String strB0 = CollectionsKt.B0(CollectionsKt.p(upc, string, string2 != null ? string2 : ""), ":", null, null, 0, null, null, 62, null);
            if (URLEncoder.encode(((Object) sb2) + strB0, StandardCharsets.UTF_8.toString()).length() >= truncationLimit) {
                z10 = true;
                break;
            }
            if (i10 > 0) {
                sb2.append("|");
            }
            sb2.append(strB0);
            i10 = i11;
        }
        W w10 = f1200a;
        String string3 = sb2.toString();
        Intrinsics.i(string3, "toString(...)");
        return (AbstractC14482i[]) CollectionsKt.r(C14476c.b("rmn_products", w10.b(string3)), C14476c.b("rmnIsTruncated", z10 ? "Yes" : "No")).toArray(new AbstractC14482i[0]);
    }

    public static /* synthetic */ AbstractC14482i[] m(List list, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 1700;
        }
        return l(list, i10);
    }

    public final AbstractC14482i.Extra d(List<Details> detailItems) {
        Intrinsics.j(detailItems, "detailItems");
        return C14476c.b("&&products", CollectionsKt.B0(detailItems, ",", null, null, 0, null, new Function1() { // from class: Ao.V
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return W.e((W.Details) obj);
            }
        }, 30, null));
    }

    public final AbstractC14482i.Extra f(EntryChange entryChange) {
        mk.i productQuantity;
        return f1200a.g((entryChange == null || (productQuantity = entryChange.getProductQuantity()) == null) ? null : productQuantity.h2());
    }

    public final AbstractC14482i.Extra g(String code) {
        if (code == null) {
            code = "";
        }
        return C14476c.b("productID", code);
    }

    public final AbstractC14482i.Extra h(mk.f product) {
        return f1200a.g(product != null ? product.getCode() : null);
    }

    public final AbstractC14482i.Extra k(Double quantity) {
        return C14476c.b("quantity", String.valueOf(quantity != null ? Double.valueOf(Math.abs(quantity.doubleValue())) : null));
    }

    public final void n(SubstitutionPair substitutionPair2) {
        substitutionPair = substitutionPair2;
    }

    public final SubstitutionPair o() {
        return substitutionPair;
    }

    private W() {
    }
}
