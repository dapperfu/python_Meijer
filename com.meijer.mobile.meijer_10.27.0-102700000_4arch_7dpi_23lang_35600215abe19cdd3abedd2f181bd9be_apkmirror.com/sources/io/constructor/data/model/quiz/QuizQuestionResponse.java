package io.constructor.data.model.quiz;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003JC\u0010\u0018\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lio/constructor/data/model/quiz/QuizQuestionResponse;", "Ljava/io/Serializable;", "nextQuestion", "Lio/constructor/data/model/quiz/QuizQuestion;", "quizVersionId", "", "quizSessionId", "quizId", "rawData", "(Lio/constructor/data/model/quiz/QuizQuestion;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getNextQuestion", "()Lio/constructor/data/model/quiz/QuizQuestion;", "getQuizId", "()Ljava/lang/String;", "getQuizSessionId", "getQuizVersionId", "getRawData", "setRawData", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class QuizQuestionResponse implements Serializable {
    private final QuizQuestion nextQuestion;
    private final String quizId;
    private final String quizSessionId;
    private final String quizVersionId;
    private String rawData;

    public static /* synthetic */ QuizQuestionResponse copy$default(QuizQuestionResponse quizQuestionResponse, QuizQuestion quizQuestion, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            quizQuestion = quizQuestionResponse.nextQuestion;
        }
        if ((i10 & 2) != 0) {
            str = quizQuestionResponse.quizVersionId;
        }
        if ((i10 & 4) != 0) {
            str2 = quizQuestionResponse.quizSessionId;
        }
        if ((i10 & 8) != 0) {
            str3 = quizQuestionResponse.quizId;
        }
        if ((i10 & 16) != 0) {
            str4 = quizQuestionResponse.rawData;
        }
        String str5 = str4;
        String str6 = str2;
        return quizQuestionResponse.copy(quizQuestion, str, str6, str3, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final QuizQuestion getNextQuestion() {
        return this.nextQuestion;
    }

    /* renamed from: component2, reason: from getter */
    public final String getQuizVersionId() {
        return this.quizVersionId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getQuizSessionId() {
        return this.quizSessionId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getQuizId() {
        return this.quizId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getRawData() {
        return this.rawData;
    }

    public final QuizQuestionResponse copy(@g(name = "next_question") QuizQuestion nextQuestion, @g(name = "quiz_version_id") String quizVersionId, @g(name = "quiz_session_id") String quizSessionId, @g(name = "quiz_id") String quizId, String rawData) {
        Intrinsics.j(quizId, "quizId");
        return new QuizQuestionResponse(nextQuestion, quizVersionId, quizSessionId, quizId, rawData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuizQuestionResponse)) {
            return false;
        }
        QuizQuestionResponse quizQuestionResponse = (QuizQuestionResponse) other;
        return Intrinsics.e(this.nextQuestion, quizQuestionResponse.nextQuestion) && Intrinsics.e(this.quizVersionId, quizQuestionResponse.quizVersionId) && Intrinsics.e(this.quizSessionId, quizQuestionResponse.quizSessionId) && Intrinsics.e(this.quizId, quizQuestionResponse.quizId) && Intrinsics.e(this.rawData, quizQuestionResponse.rawData);
    }

    public int hashCode() {
        QuizQuestion quizQuestion = this.nextQuestion;
        int iHashCode = (quizQuestion == null ? 0 : quizQuestion.hashCode()) * 31;
        String str = this.quizVersionId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.quizSessionId;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.quizId.hashCode()) * 31;
        String str3 = this.rawData;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "QuizQuestionResponse(nextQuestion=" + this.nextQuestion + ", quizVersionId=" + this.quizVersionId + ", quizSessionId=" + this.quizSessionId + ", quizId=" + this.quizId + ", rawData=" + this.rawData + ")";
    }

    public QuizQuestionResponse(@g(name = "next_question") QuizQuestion quizQuestion, @g(name = "quiz_version_id") String str, @g(name = "quiz_session_id") String str2, @g(name = "quiz_id") String quizId, String str3) {
        Intrinsics.j(quizId, "quizId");
        this.nextQuestion = quizQuestion;
        this.quizVersionId = str;
        this.quizSessionId = str2;
        this.quizId = quizId;
        this.rawData = str3;
    }

    public final QuizQuestion getNextQuestion() {
        return this.nextQuestion;
    }

    public final String getQuizId() {
        return this.quizId;
    }

    public final String getQuizSessionId() {
        return this.quizSessionId;
    }

    public final String getQuizVersionId() {
        return this.quizVersionId;
    }

    public final String getRawData() {
        return this.rawData;
    }

    public final void setRawData(String str) {
        this.rawData = str;
    }
}
