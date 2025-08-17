package com.meijer.mobile.meijer.search;

import Co.ProductFullDetails;
import Go.Suggestion;
import Qo.l;
import android.graphics.Rect;
import fi.GoogleAdAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ss.InterfaceC17023a;
import vs.CartProductListDecorator;

@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:%\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&\u0082\u0001%'()*+,-./0123456789:;<=>?@ABCDEFGHIJKø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006LÀ\u0006\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/search/R1;", "", "q", "F", "t", "s", "m", "e", "K", "J", "r", "A", "p", "g", "h", "o", "B", "n", "x", "v", "I", "C", "z", "G", "a", "E", "k", "b", "d", "D", "y", "l", "j", "H", "u", "w", "i", "c", "f", "Lcom/meijer/mobile/meijer/search/R1$a;", "Lcom/meijer/mobile/meijer/search/R1$b;", "Lcom/meijer/mobile/meijer/search/R1$c;", "Lcom/meijer/mobile/meijer/search/R1$d;", "Lcom/meijer/mobile/meijer/search/R1$e;", "Lcom/meijer/mobile/meijer/search/R1$f;", "Lcom/meijer/mobile/meijer/search/R1$g;", "Lcom/meijer/mobile/meijer/search/R1$h;", "Lcom/meijer/mobile/meijer/search/R1$i;", "Lcom/meijer/mobile/meijer/search/R1$j;", "Lcom/meijer/mobile/meijer/search/R1$k;", "Lcom/meijer/mobile/meijer/search/R1$l;", "Lcom/meijer/mobile/meijer/search/R1$m;", "Lcom/meijer/mobile/meijer/search/R1$n;", "Lcom/meijer/mobile/meijer/search/R1$o;", "Lcom/meijer/mobile/meijer/search/R1$p;", "Lcom/meijer/mobile/meijer/search/R1$q;", "Lcom/meijer/mobile/meijer/search/R1$r;", "Lcom/meijer/mobile/meijer/search/R1$s;", "Lcom/meijer/mobile/meijer/search/R1$t;", "Lcom/meijer/mobile/meijer/search/R1$u;", "Lcom/meijer/mobile/meijer/search/R1$v;", "Lcom/meijer/mobile/meijer/search/R1$w;", "Lcom/meijer/mobile/meijer/search/R1$x;", "Lcom/meijer/mobile/meijer/search/R1$y;", "Lcom/meijer/mobile/meijer/search/R1$z;", "Lcom/meijer/mobile/meijer/search/R1$A;", "Lcom/meijer/mobile/meijer/search/R1$B;", "Lcom/meijer/mobile/meijer/search/R1$C;", "Lcom/meijer/mobile/meijer/search/R1$D;", "Lcom/meijer/mobile/meijer/search/R1$E;", "Lcom/meijer/mobile/meijer/search/R1$F;", "Lcom/meijer/mobile/meijer/search/R1$G;", "Lcom/meijer/mobile/meijer/search/R1$H;", "Lcom/meijer/mobile/meijer/search/R1$I;", "Lcom/meijer/mobile/meijer/search/R1$J;", "Lcom/meijer/mobile/meijer/search/R1$K;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface R1 {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/search/R1$C;", "Lcom/meijer/mobile/meijer/search/R1;", "LGo/c;", "suggestion", "<init>", "(LGo/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LGo/c;", "()LGo/c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.search.R1$C, reason: from toString */
    public static final /* data */ class SearchSuggestionTapped implements R1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Suggestion suggestion;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SearchSuggestionTapped) && Intrinsics.e(this.suggestion, ((SearchSuggestionTapped) other).suggestion);
        }

        public int hashCode() {
            return this.suggestion.hashCode();
        }

        public String toString() {
            return "SearchSuggestionTapped(suggestion=" + this.suggestion + ')';
        }

        public SearchSuggestionTapped(Suggestion suggestion) {
            Intrinsics.j(suggestion, "suggestion");
            this.suggestion = suggestion;
        }

        /* renamed from: a, reason: from getter */
        public final Suggestion getSuggestion() {
            return this.suggestion;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/search/R1$D;", "Lcom/meijer/mobile/meijer/search/R1;", "LQo/l$k;", "query", "<init>", "(LQo/l$k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LQo/l$k;", "()LQo/l$k;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.search.R1$D, reason: from toString */
    public static final /* data */ class SetDeeplinkFacet implements R1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final l.k query;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SetDeeplinkFacet) && Intrinsics.e(this.query, ((SetDeeplinkFacet) other).query);
        }

        public int hashCode() {
            return this.query.hashCode();
        }

        public String toString() {
            return "SetDeeplinkFacet(query=" + this.query + ')';
        }

        public SetDeeplinkFacet(l.k query) {
            Intrinsics.j(query, "query");
            this.query = query;
        }

        /* renamed from: a, reason: from getter */
        public final l.k getQuery() {
            return this.query;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/meijer/search/R1$E;", "Lcom/meijer/mobile/meijer/search/R1;", "", "productCode", "", "quantityToUpdate", "Landroid/graphics/Rect;", "stepperHitRect", "<init>", "(Ljava/lang/String;DLandroid/graphics/Rect;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "D", "getQuantityToUpdate", "()D", "c", "Landroid/graphics/Rect;", "getStepperHitRect", "()Landroid/graphics/Rect;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.search.R1$E, reason: from toString */
    public static final /* data */ class StepperStateChanged implements R1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String productCode;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final double quantityToUpdate;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Rect stepperHitRect;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StepperStateChanged)) {
                return false;
            }
            StepperStateChanged stepperStateChanged = (StepperStateChanged) other;
            return Intrinsics.e(this.productCode, stepperStateChanged.productCode) && Double.compare(this.quantityToUpdate, stepperStateChanged.quantityToUpdate) == 0 && Intrinsics.e(this.stepperHitRect, stepperStateChanged.stepperHitRect);
        }

        public int hashCode() {
            return (((this.productCode.hashCode() * 31) + Double.hashCode(this.quantityToUpdate)) * 31) + this.stepperHitRect.hashCode();
        }

        public String toString() {
            return "StepperStateChanged(productCode=" + this.productCode + ", quantityToUpdate=" + this.quantityToUpdate + ", stepperHitRect=" + this.stepperHitRect + ')';
        }

        public StepperStateChanged(String productCode, double d10, Rect stepperHitRect) {
            Intrinsics.j(productCode, "productCode");
            Intrinsics.j(stepperHitRect, "stepperHitRect");
            this.productCode = productCode;
            this.quantityToUpdate = d10;
            this.stepperHitRect = stepperHitRect;
        }

        /* renamed from: a, reason: from getter */
        public final String getProductCode() {
            return this.productCode;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/search/R1$G;", "Lcom/meijer/mobile/meijer/search/R1;", "", "newTerm", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.search.R1$G, reason: from toString */
    public static final /* data */ class TypingSearchTerm implements R1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String newTerm;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TypingSearchTerm) && Intrinsics.e(this.newTerm, ((TypingSearchTerm) other).newTerm);
        }

        public int hashCode() {
            return this.newTerm.hashCode();
        }

        public String toString() {
            return "TypingSearchTerm(newTerm=" + this.newTerm + ')';
        }

        public TypingSearchTerm(String newTerm) {
            Intrinsics.j(newTerm, "newTerm");
            this.newTerm = newTerm;
        }

        /* renamed from: a, reason: from getter */
        public final String getNewTerm() {
            return this.newTerm;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/meijer/search/R1$H;", "Lcom/meijer/mobile/meijer/search/R1;", "LCo/h;", "product", "", "quantityToUpdate", "<init>", "(LCo/h;D)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LCo/h;", "()LCo/h;", "b", "D", "()D", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.search.R1$H, reason: from toString */
    public static final /* data */ class UpdateEntry implements R1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProductFullDetails product;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final double quantityToUpdate;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateEntry)) {
                return false;
            }
            UpdateEntry updateEntry = (UpdateEntry) other;
            return Intrinsics.e(this.product, updateEntry.product) && Double.compare(this.quantityToUpdate, updateEntry.quantityToUpdate) == 0;
        }

        public int hashCode() {
            return (this.product.hashCode() * 31) + Double.hashCode(this.quantityToUpdate);
        }

        public String toString() {
            return "UpdateEntry(product=" + this.product + ", quantityToUpdate=" + this.quantityToUpdate + ')';
        }

        public UpdateEntry(ProductFullDetails product, double d10) {
            Intrinsics.j(product, "product");
            this.product = product;
            this.quantityToUpdate = d10;
        }

        /* renamed from: a, reason: from getter */
        public final ProductFullDetails getProduct() {
            return this.product;
        }

        /* renamed from: b, reason: from getter */
        public final double getQuantityToUpdate() {
            return this.quantityToUpdate;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/search/R1$a;", "Lcom/meijer/mobile/meijer/search/R1;", "", "newTerm", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.search.R1$a, reason: case insensitive filesystem and from toString */
    public static final /* data */ class AutocompleteSelected implements R1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String newTerm;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AutocompleteSelected) && Intrinsics.e(this.newTerm, ((AutocompleteSelected) other).newTerm);
        }

        public int hashCode() {
            return this.newTerm.hashCode();
        }

        public String toString() {
            return "AutocompleteSelected(newTerm=" + this.newTerm + ')';
        }

        public AutocompleteSelected(String newTerm) {
            Intrinsics.j(newTerm, "newTerm");
            this.newTerm = newTerm;
        }

        /* renamed from: a, reason: from getter */
        public final String getNewTerm() {
            return this.newTerm;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/meijer/search/R1$b;", "Lcom/meijer/mobile/meijer/search/R1;", "", "hasScannedProductExtra", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.search.R1$b, reason: case insensitive filesystem and from toString */
    public static final /* data */ class BarcodeIconTapped implements R1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean hasScannedProductExtra;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BarcodeIconTapped) && this.hasScannedProductExtra == ((BarcodeIconTapped) other).hasScannedProductExtra;
        }

        public int hashCode() {
            return Boolean.hashCode(this.hasScannedProductExtra);
        }

        public String toString() {
            return "BarcodeIconTapped(hasScannedProductExtra=" + this.hasScannedProductExtra + ')';
        }

        /* renamed from: a, reason: from getter */
        public final boolean getHasScannedProductExtra() {
            return this.hasScannedProductExtra;
        }

        public BarcodeIconTapped(boolean z10) {
            this.hasScannedProductExtra = z10;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/meijer/search/R1$h;", "Lcom/meijer/mobile/meijer/search/R1;", "", "originalTerm", "searchTerm", "", "isScannedUpc", "isSuggestion", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Z", "()Z", "d", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.search.R1$h, reason: case insensitive filesystem and from toString */
    public static final /* data */ class CompleteSearchAction implements R1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String originalTerm;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String searchTerm;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isScannedUpc;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isSuggestion;

        public CompleteSearchAction(String originalTerm, String searchTerm, boolean z10, boolean z11) {
            Intrinsics.j(originalTerm, "originalTerm");
            Intrinsics.j(searchTerm, "searchTerm");
            this.originalTerm = originalTerm;
            this.searchTerm = searchTerm;
            this.isScannedUpc = z10;
            this.isSuggestion = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CompleteSearchAction)) {
                return false;
            }
            CompleteSearchAction completeSearchAction = (CompleteSearchAction) other;
            return Intrinsics.e(this.originalTerm, completeSearchAction.originalTerm) && Intrinsics.e(this.searchTerm, completeSearchAction.searchTerm) && this.isScannedUpc == completeSearchAction.isScannedUpc && this.isSuggestion == completeSearchAction.isSuggestion;
        }

        public int hashCode() {
            return (((((this.originalTerm.hashCode() * 31) + this.searchTerm.hashCode()) * 31) + Boolean.hashCode(this.isScannedUpc)) * 31) + Boolean.hashCode(this.isSuggestion);
        }

        public String toString() {
            return "CompleteSearchAction(originalTerm=" + this.originalTerm + ", searchTerm=" + this.searchTerm + ", isScannedUpc=" + this.isScannedUpc + ", isSuggestion=" + this.isSuggestion + ')';
        }

        /* renamed from: a, reason: from getter */
        public final String getOriginalTerm() {
            return this.originalTerm;
        }

        /* renamed from: b, reason: from getter */
        public final String getSearchTerm() {
            return this.searchTerm;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getIsScannedUpc() {
            return this.isScannedUpc;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getIsSuggestion() {
            return this.isSuggestion;
        }

        public /* synthetic */ CompleteSearchAction(String str, String str2, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? str : str2, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/search/R1$j;", "Lcom/meijer/mobile/meijer/search/R1;", "", "deeplink", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.search.R1$j, reason: case insensitive filesystem and from toString */
    public static final /* data */ class DepartmentItemClicked implements R1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String deeplink;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DepartmentItemClicked)) {
                return false;
            }
            DepartmentItemClicked departmentItemClicked = (DepartmentItemClicked) other;
            return Intrinsics.e(this.deeplink, departmentItemClicked.deeplink) && Intrinsics.e(this.name, departmentItemClicked.name);
        }

        public int hashCode() {
            return (this.deeplink.hashCode() * 31) + this.name.hashCode();
        }

        public String toString() {
            return "DepartmentItemClicked(deeplink=" + this.deeplink + ", name=" + this.name + ')';
        }

        public DepartmentItemClicked(String deeplink, String name) {
            Intrinsics.j(deeplink, "deeplink");
            Intrinsics.j(name, "name");
            this.deeplink = deeplink;
            this.name = name;
        }

        /* renamed from: a, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* renamed from: b, reason: from getter */
        public final String getName() {
            return this.name;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/search/R1$o;", "Lcom/meijer/mobile/meijer/search/R1;", "Lfi/a;", "googleAdAnalytics", "<init>", "(Lfi/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfi/a;", "()Lfi/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.search.R1$o, reason: from toString */
    public static final /* data */ class GoogleAdClicked implements R1 {

        /* renamed from: b, reason: collision with root package name */
        public static final int f113041b = GoogleAdAnalytics.f131141f;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final GoogleAdAnalytics googleAdAnalytics;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GoogleAdClicked) && Intrinsics.e(this.googleAdAnalytics, ((GoogleAdClicked) other).googleAdAnalytics);
        }

        public int hashCode() {
            return this.googleAdAnalytics.hashCode();
        }

        public String toString() {
            return "GoogleAdClicked(googleAdAnalytics=" + this.googleAdAnalytics + ')';
        }

        public GoogleAdClicked(GoogleAdAnalytics googleAdAnalytics) {
            Intrinsics.j(googleAdAnalytics, "googleAdAnalytics");
            this.googleAdAnalytics = googleAdAnalytics;
        }

        /* renamed from: a, reason: from getter */
        public final GoogleAdAnalytics getGoogleAdAnalytics() {
            return this.googleAdAnalytics;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/meijer/mobile/meijer/search/R1$p;", "Lcom/meijer/mobile/meijer/search/R1;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "resultCode", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.search.R1$p, reason: from toString */
    public static final /* data */ class HandleSubstitutionResult implements R1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int resultCode;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HandleSubstitutionResult) && this.resultCode == ((HandleSubstitutionResult) other).resultCode;
        }

        public int hashCode() {
            return Integer.hashCode(this.resultCode);
        }

        public String toString() {
            return "HandleSubstitutionResult(resultCode=" + this.resultCode + ')';
        }

        /* renamed from: a, reason: from getter */
        public final int getResultCode() {
            return this.resultCode;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001a\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b\u001b\u0010\u000e¨\u0006\""}, d2 = {"Lcom/meijer/mobile/meijer/search/R1$q;", "Lcom/meijer/mobile/meijer/search/R1;", "", "packageName", "filterActivityClassName", "findSubstitutionName", "Lvs/b;", "itemToSubstitute", "LPp/b;", "searchType", "initialSearchTerm", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvs/b;LPp/b;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "c", "d", "Lvs/b;", "()Lvs/b;", "LPp/b;", "f", "()LPp/b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.search.R1$q, reason: from toString */
    public static final /* data */ class InitializeViewModel implements R1 {

        /* renamed from: g, reason: collision with root package name */
        public static final int f113044g = CartProductListDecorator.f164957s;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String packageName;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String filterActivityClassName;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String findSubstitutionName;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final CartProductListDecorator itemToSubstitute;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Pp.b searchType;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String initialSearchTerm;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InitializeViewModel)) {
                return false;
            }
            InitializeViewModel initializeViewModel = (InitializeViewModel) other;
            return Intrinsics.e(this.packageName, initializeViewModel.packageName) && Intrinsics.e(this.filterActivityClassName, initializeViewModel.filterActivityClassName) && Intrinsics.e(this.findSubstitutionName, initializeViewModel.findSubstitutionName) && Intrinsics.e(this.itemToSubstitute, initializeViewModel.itemToSubstitute) && this.searchType == initializeViewModel.searchType && Intrinsics.e(this.initialSearchTerm, initializeViewModel.initialSearchTerm);
        }

        public int hashCode() {
            int iHashCode = ((((this.packageName.hashCode() * 31) + this.filterActivityClassName.hashCode()) * 31) + this.findSubstitutionName.hashCode()) * 31;
            CartProductListDecorator cartProductListDecorator = this.itemToSubstitute;
            int iHashCode2 = (iHashCode + (cartProductListDecorator == null ? 0 : cartProductListDecorator.hashCode())) * 31;
            Pp.b bVar = this.searchType;
            int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            String str = this.initialSearchTerm;
            return iHashCode3 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "InitializeViewModel(packageName=" + this.packageName + ", filterActivityClassName=" + this.filterActivityClassName + ", findSubstitutionName=" + this.findSubstitutionName + ", itemToSubstitute=" + this.itemToSubstitute + ", searchType=" + this.searchType + ", initialSearchTerm=" + this.initialSearchTerm + ')';
        }

        public InitializeViewModel(String packageName, String filterActivityClassName, String findSubstitutionName, CartProductListDecorator cartProductListDecorator, Pp.b bVar, String str) {
            Intrinsics.j(packageName, "packageName");
            Intrinsics.j(filterActivityClassName, "filterActivityClassName");
            Intrinsics.j(findSubstitutionName, "findSubstitutionName");
            this.packageName = packageName;
            this.filterActivityClassName = filterActivityClassName;
            this.findSubstitutionName = findSubstitutionName;
            this.itemToSubstitute = cartProductListDecorator;
            this.searchType = bVar;
            this.initialSearchTerm = str;
        }

        /* renamed from: a, reason: from getter */
        public final String getFilterActivityClassName() {
            return this.filterActivityClassName;
        }

        /* renamed from: b, reason: from getter */
        public final String getFindSubstitutionName() {
            return this.findSubstitutionName;
        }

        /* renamed from: c, reason: from getter */
        public final String getInitialSearchTerm() {
            return this.initialSearchTerm;
        }

        /* renamed from: d, reason: from getter */
        public final CartProductListDecorator getItemToSubstitute() {
            return this.itemToSubstitute;
        }

        /* renamed from: e, reason: from getter */
        public final String getPackageName() {
            return this.packageName;
        }

        /* renamed from: f, reason: from getter */
        public final Pp.b getSearchType() {
            return this.searchType;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/meijer/search/R1$u;", "Lcom/meijer/mobile/meijer/search/R1;", "", "uriString", "carouselTitle", "", "isFromSeeMoreItems", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.search.R1$u, reason: from toString */
    public static final /* data */ class PersonalizedProductListClicked implements R1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String uriString;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String carouselTitle;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isFromSeeMoreItems;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PersonalizedProductListClicked)) {
                return false;
            }
            PersonalizedProductListClicked personalizedProductListClicked = (PersonalizedProductListClicked) other;
            return Intrinsics.e(this.uriString, personalizedProductListClicked.uriString) && Intrinsics.e(this.carouselTitle, personalizedProductListClicked.carouselTitle) && this.isFromSeeMoreItems == personalizedProductListClicked.isFromSeeMoreItems;
        }

        public int hashCode() {
            String str = this.uriString;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.carouselTitle;
            return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isFromSeeMoreItems);
        }

        public String toString() {
            return "PersonalizedProductListClicked(uriString=" + this.uriString + ", carouselTitle=" + this.carouselTitle + ", isFromSeeMoreItems=" + this.isFromSeeMoreItems + ')';
        }

        /* renamed from: a, reason: from getter */
        public final String getCarouselTitle() {
            return this.carouselTitle;
        }

        /* renamed from: b, reason: from getter */
        public final String getUriString() {
            return this.uriString;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getIsFromSeeMoreItems() {
            return this.isFromSeeMoreItems;
        }

        public PersonalizedProductListClicked(String str, String str2, boolean z10) {
            this.uriString = str;
            this.carouselTitle = str2;
            this.isFromSeeMoreItems = z10;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/search/R1$v;", "Lcom/meijer/mobile/meijer/search/R1;", "LPk/a;", "couponAction", "<init>", "(LPk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LPk/a;", "()LPk/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.search.R1$v, reason: from toString */
    public static final /* data */ class ProcessCouponAction implements R1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Pk.a couponAction;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ProcessCouponAction) && Intrinsics.e(this.couponAction, ((ProcessCouponAction) other).couponAction);
        }

        public int hashCode() {
            return this.couponAction.hashCode();
        }

        public String toString() {
            return "ProcessCouponAction(couponAction=" + this.couponAction + ')';
        }

        public ProcessCouponAction(Pk.a couponAction) {
            Intrinsics.j(couponAction, "couponAction");
            this.couponAction = couponAction;
        }

        /* renamed from: a, reason: from getter */
        public final Pk.a getCouponAction() {
            return this.couponAction;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/meijer/mobile/meijer/search/R1$w;", "Lcom/meijer/mobile/meijer/search/R1;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "searchTerm", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.search.R1$w, reason: from toString */
    public static final /* data */ class ProcessOnResumeSearchExtra implements R1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String searchTerm;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ProcessOnResumeSearchExtra) && Intrinsics.e(this.searchTerm, ((ProcessOnResumeSearchExtra) other).searchTerm);
        }

        public int hashCode() {
            return this.searchTerm.hashCode();
        }

        public String toString() {
            return "ProcessOnResumeSearchExtra(searchTerm=" + this.searchTerm + ')';
        }

        /* renamed from: a, reason: from getter */
        public final String getSearchTerm() {
            return this.searchTerm;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/search/R1$x;", "Lcom/meijer/mobile/meijer/search/R1;", "Lss/a;", "productCardAction", "<init>", "(Lss/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lss/a;", "()Lss/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.search.R1$x, reason: from toString */
    public static final /* data */ class ProcessProductCardAction implements R1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final InterfaceC17023a productCardAction;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ProcessProductCardAction) && Intrinsics.e(this.productCardAction, ((ProcessProductCardAction) other).productCardAction);
        }

        public int hashCode() {
            return this.productCardAction.hashCode();
        }

        public String toString() {
            return "ProcessProductCardAction(productCardAction=" + this.productCardAction + ')';
        }

        public ProcessProductCardAction(InterfaceC17023a productCardAction) {
            Intrinsics.j(productCardAction, "productCardAction");
            this.productCardAction = productCardAction;
        }

        /* renamed from: a, reason: from getter */
        public final InterfaceC17023a getProductCardAction() {
            return this.productCardAction;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/meijer/search/R1$y;", "Lcom/meijer/mobile/meijer/search/R1;", "LCo/h;", "product", "", "trackingState", "<init>", "(LCo/h;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LCo/h;", "()LCo/h;", "b", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.search.R1$y, reason: from toString */
    public static final /* data */ class ProductFromBuyAgainCarouselTapped implements R1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProductFullDetails product;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String trackingState;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductFromBuyAgainCarouselTapped)) {
                return false;
            }
            ProductFromBuyAgainCarouselTapped productFromBuyAgainCarouselTapped = (ProductFromBuyAgainCarouselTapped) other;
            return Intrinsics.e(this.product, productFromBuyAgainCarouselTapped.product) && Intrinsics.e(this.trackingState, productFromBuyAgainCarouselTapped.trackingState);
        }

        public int hashCode() {
            int iHashCode = this.product.hashCode() * 31;
            String str = this.trackingState;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "ProductFromBuyAgainCarouselTapped(product=" + this.product + ", trackingState=" + this.trackingState + ')';
        }

        public ProductFromBuyAgainCarouselTapped(ProductFullDetails product, String str) {
            Intrinsics.j(product, "product");
            this.product = product;
            this.trackingState = str;
        }

        /* renamed from: a, reason: from getter */
        public final ProductFullDetails getProduct() {
            return this.product;
        }

        /* renamed from: b, reason: from getter */
        public final String getTrackingState() {
            return this.trackingState;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/search/R1$z;", "Lcom/meijer/mobile/meijer/search/R1;", "", "searchTerm", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.search.R1$z, reason: from toString */
    public static final /* data */ class RecentSearchItemTapped implements R1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String searchTerm;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RecentSearchItemTapped) && Intrinsics.e(this.searchTerm, ((RecentSearchItemTapped) other).searchTerm);
        }

        public int hashCode() {
            return this.searchTerm.hashCode();
        }

        public String toString() {
            return "RecentSearchItemTapped(searchTerm=" + this.searchTerm + ')';
        }

        public RecentSearchItemTapped(String searchTerm) {
            Intrinsics.j(searchTerm, "searchTerm");
            this.searchTerm = searchTerm;
        }

        /* renamed from: a, reason: from getter */
        public final String getSearchTerm() {
            return this.searchTerm;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/search/R1$A;", "Lcom/meijer/mobile/meijer/search/R1;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class A implements R1 {

        /* renamed from: a, reason: collision with root package name */
        public static final A f113009a = new A();

        public boolean equals(Object other) {
            return this == other || (other instanceof A);
        }

        public int hashCode() {
            return -1222272057;
        }

        public String toString() {
            return "SaveButtonClicked";
        }

        private A() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/search/R1$B;", "Lcom/meijer/mobile/meijer/search/R1;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class B implements R1 {

        /* renamed from: a, reason: collision with root package name */
        public static final B f113010a = new B();

        public boolean equals(Object other) {
            return this == other || (other instanceof B);
        }

        public int hashCode() {
            return -199291305;
        }

        public String toString() {
            return "SearchButtonTapped";
        }

        private B() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/search/R1$F;", "Lcom/meijer/mobile/meijer/search/R1;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class F implements R1 {

        /* renamed from: a, reason: collision with root package name */
        public static final F f113016a = new F();

        public boolean equals(Object other) {
            return this == other || (other instanceof F);
        }

        public int hashCode() {
            return -1036903352;
        }

        public String toString() {
            return "TrackInputFocus";
        }

        private F() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/search/R1$I;", "Lcom/meijer/mobile/meijer/search/R1;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class I implements R1 {

        /* renamed from: a, reason: collision with root package name */
        public static final I f113020a = new I();

        public boolean equals(Object other) {
            return this == other || (other instanceof I);
        }

        public int hashCode() {
            return 965709666;
        }

        public String toString() {
            return "ViewAllDepartmentsTapped";
        }

        private I() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/search/R1$J;", "Lcom/meijer/mobile/meijer/search/R1;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class J implements R1 {

        /* renamed from: a, reason: collision with root package name */
        public static final J f113021a = new J();

        public boolean equals(Object other) {
            return this == other || (other instanceof J);
        }

        public int hashCode() {
            return -768205591;
        }

        public String toString() {
            return "ViewDepartmentsButtonTapped";
        }

        private J() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/search/R1$K;", "Lcom/meijer/mobile/meijer/search/R1;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class K implements R1 {

        /* renamed from: a, reason: collision with root package name */
        public static final K f113022a = new K();

        public boolean equals(Object other) {
            return this == other || (other instanceof K);
        }

        public int hashCode() {
            return -389957281;
        }

        public String toString() {
            return "ViewFavoritesButtonTapped";
        }

        private K() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/search/R1$c;", "Lcom/meijer/mobile/meijer/search/R1;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.search.R1$c, reason: case insensitive filesystem */
    public static final /* data */ class C12566c implements R1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C12566c f113025a = new C12566c();

        public boolean equals(Object other) {
            return this == other || (other instanceof C12566c);
        }

        public int hashCode() {
            return -2129492610;
        }

        public String toString() {
            return "BrowseCouponsTapped";
        }

        private C12566c() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/search/R1$d;", "Lcom/meijer/mobile/meijer/search/R1;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.search.R1$d, reason: case insensitive filesystem */
    public static final /* data */ class C12567d implements R1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C12567d f113026a = new C12567d();

        public boolean equals(Object other) {
            return this == other || (other instanceof C12567d);
        }

        public int hashCode() {
            return 1802306646;
        }

        public String toString() {
            return "CartIconTapped";
        }

        private C12567d() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/search/R1$e;", "Lcom/meijer/mobile/meijer/search/R1;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.search.R1$e, reason: case insensitive filesystem */
    public static final /* data */ class C12568e implements R1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C12568e f113027a = new C12568e();

        public boolean equals(Object other) {
            return this == other || (other instanceof C12568e);
        }

        public int hashCode() {
            return -4590054;
        }

        public String toString() {
            return "ClearRecentsList";
        }

        private C12568e() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/search/R1$f;", "Lcom/meijer/mobile/meijer/search/R1;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.search.R1$f, reason: case insensitive filesystem */
    public static final /* data */ class C12569f implements R1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C12569f f113028a = new C12569f();

        public boolean equals(Object other) {
            return this == other || (other instanceof C12569f);
        }

        public int hashCode() {
            return 1658358408;
        }

        public String toString() {
            return "ClipLimitReachedLabelTapped";
        }

        private C12569f() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/search/R1$g;", "Lcom/meijer/mobile/meijer/search/R1;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.search.R1$g, reason: case insensitive filesystem */
    public static final /* data */ class C12570g implements R1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C12570g f113029a = new C12570g();

        public boolean equals(Object other) {
            return this == other || (other instanceof C12570g);
        }

        public int hashCode() {
            return 143250120;
        }

        public String toString() {
            return "CollapseQuantityStepper";
        }

        private C12570g() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/search/R1$i;", "Lcom/meijer/mobile/meijer/search/R1;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.search.R1$i, reason: case insensitive filesystem */
    public static final /* data */ class C12572i implements R1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C12572i f113034a = new C12572i();

        public boolean equals(Object other) {
            return this == other || (other instanceof C12572i);
        }

        public int hashCode() {
            return -1434897004;
        }

        public String toString() {
            return "CouponResultError";
        }

        private C12572i() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/search/R1$k;", "Lcom/meijer/mobile/meijer/search/R1;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.search.R1$k, reason: case insensitive filesystem */
    public static final /* data */ class C12574k implements R1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C12574k f113037a = new C12574k();

        public boolean equals(Object other) {
            return this == other || (other instanceof C12574k);
        }

        public int hashCode() {
            return 1360817208;
        }

        public String toString() {
            return "FetchCarouselDepartments";
        }

        private C12574k() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/search/R1$l;", "Lcom/meijer/mobile/meijer/search/R1;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class l implements R1 {

        /* renamed from: a, reason: collision with root package name */
        public static final l f113038a = new l();

        public boolean equals(Object other) {
            return this == other || (other instanceof l);
        }

        public int hashCode() {
            return 422053558;
        }

        public String toString() {
            return "FetchCarouselRecommendedProducts";
        }

        private l() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/search/R1$m;", "Lcom/meijer/mobile/meijer/search/R1;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class m implements R1 {

        /* renamed from: a, reason: collision with root package name */
        public static final m f113039a = new m();

        public boolean equals(Object other) {
            return this == other || (other instanceof m);
        }

        public int hashCode() {
            return -1498547540;
        }

        public String toString() {
            return "FilterAndSort";
        }

        private m() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/search/R1$n;", "Lcom/meijer/mobile/meijer/search/R1;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class n implements R1 {

        /* renamed from: a, reason: collision with root package name */
        public static final n f113040a = new n();

        public boolean equals(Object other) {
            return this == other || (other instanceof n);
        }

        public int hashCode() {
            return 1868943307;
        }

        public String toString() {
            return "FulfillmentButtonTapped";
        }

        private n() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/search/R1$r;", "Lcom/meijer/mobile/meijer/search/R1;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class r implements R1 {

        /* renamed from: a, reason: collision with root package name */
        public static final r f113051a = new r();

        public boolean equals(Object other) {
            return this == other || (other instanceof r);
        }

        public int hashCode() {
            return -707455920;
        }

        public String toString() {
            return "LoadMoreProducts";
        }

        private r() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/search/R1$s;", "Lcom/meijer/mobile/meijer/search/R1;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class s implements R1 {

        /* renamed from: a, reason: collision with root package name */
        public static final s f113052a = new s();

        public boolean equals(Object other) {
            return this == other || (other instanceof s);
        }

        public int hashCode() {
            return 476398244;
        }

        public String toString() {
            return "NavigationIconFromSearchBarClicked";
        }

        private s() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/search/R1$t;", "Lcom/meijer/mobile/meijer/search/R1;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class t implements R1 {

        /* renamed from: a, reason: collision with root package name */
        public static final t f113053a = new t();

        public boolean equals(Object other) {
            return this == other || (other instanceof t);
        }

        public int hashCode() {
            return -1676201868;
        }

        public String toString() {
            return "NavigationIconFromToolbarClicked";
        }

        private t() {
        }
    }
}
