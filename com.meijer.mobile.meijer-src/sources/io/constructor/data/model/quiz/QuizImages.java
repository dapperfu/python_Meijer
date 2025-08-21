package io.constructor.data.model.quiz;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lio/constructor/data/model/quiz/QuizImages;", "Ljava/io/Serializable;", "primaryUrl", "", "primaryAlt", "secondaryUrl", "secondaryAlt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPrimaryAlt", "()Ljava/lang/String;", "getPrimaryUrl", "getSecondaryAlt", "getSecondaryUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class QuizImages implements Serializable {
    private final String primaryAlt;
    private final String primaryUrl;
    private final String secondaryAlt;
    private final String secondaryUrl;

    public static /* synthetic */ QuizImages copy$default(QuizImages quizImages, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = quizImages.primaryUrl;
        }
        if ((i10 & 2) != 0) {
            str2 = quizImages.primaryAlt;
        }
        if ((i10 & 4) != 0) {
            str3 = quizImages.secondaryUrl;
        }
        if ((i10 & 8) != 0) {
            str4 = quizImages.secondaryAlt;
        }
        return quizImages.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPrimaryUrl() {
        return this.primaryUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPrimaryAlt() {
        return this.primaryAlt;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSecondaryUrl() {
        return this.secondaryUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSecondaryAlt() {
        return this.secondaryAlt;
    }

    public final QuizImages copy(@g(name = "primary_url") String primaryUrl, @g(name = "primary_alt") String primaryAlt, @g(name = "secondary_url") String secondaryUrl, @g(name = "secondary_alt") String secondaryAlt) {
        return new QuizImages(primaryUrl, primaryAlt, secondaryUrl, secondaryAlt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuizImages)) {
            return false;
        }
        QuizImages quizImages = (QuizImages) other;
        return Intrinsics.e(this.primaryUrl, quizImages.primaryUrl) && Intrinsics.e(this.primaryAlt, quizImages.primaryAlt) && Intrinsics.e(this.secondaryUrl, quizImages.secondaryUrl) && Intrinsics.e(this.secondaryAlt, quizImages.secondaryAlt);
    }

    public int hashCode() {
        String str = this.primaryUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.primaryAlt;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.secondaryUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.secondaryAlt;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "QuizImages(primaryUrl=" + this.primaryUrl + ", primaryAlt=" + this.primaryAlt + ", secondaryUrl=" + this.secondaryUrl + ", secondaryAlt=" + this.secondaryAlt + ")";
    }

    public final String getPrimaryAlt() {
        return this.primaryAlt;
    }

    public final String getPrimaryUrl() {
        return this.primaryUrl;
    }

    public final String getSecondaryAlt() {
        return this.secondaryAlt;
    }

    public final String getSecondaryUrl() {
        return this.secondaryUrl;
    }

    public QuizImages(@g(name = "primary_url") String str, @g(name = "primary_alt") String str2, @g(name = "secondary_url") String str3, @g(name = "secondary_alt") String str4) {
        this.primaryUrl = str;
        this.primaryAlt = str2;
        this.secondaryUrl = str3;
        this.secondaryAlt = str4;
    }
}
