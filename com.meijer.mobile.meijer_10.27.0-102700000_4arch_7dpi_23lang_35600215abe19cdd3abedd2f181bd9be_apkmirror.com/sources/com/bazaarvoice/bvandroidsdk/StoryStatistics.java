package com.bazaarvoice.bvandroidsdk;

import java.util.Date;
import java.util.List;
import mg.InterfaceC15617c;

/* loaded from: classes4.dex */
class StoryStatistics {

    @InterfaceC15617c("FeaturedStoryCount")
    int featuredStoryCount;

    @InterfaceC15617c("FirstSubmissionTime")
    Date firstSubmissionTime;

    @InterfaceC15617c("HelpFulVoteCount")
    int helpFulVoteCount;

    @InterfaceC15617c("LastSubmissionTime")
    Date lastSubmissionTime;

    @InterfaceC15617c("Name")
    String name;

    @InterfaceC15617c("NotHelpFulVoteCount")
    int notHelpFulVoteCount;

    @InterfaceC15617c("TagDistribution")
    TagDistribution tagDistribution;

    @InterfaceC15617c("TagDistribvutionOrder")
    List<String> tagDistribvutionOrder;

    @InterfaceC15617c("TotalStoryCount")
    int totalStoryCount;

    private class TagDistribution {
        Topic topic;

        private TagDistribution() {
        }

        public Topic getTopic() {
            return this.topic;
        }
    }

    private class Topic {
        List<TopicValue> values;

        private Topic() {
        }

        public List<TopicValue> getValues() {
            return this.values;
        }
    }

    private class TopicValue {
        int count;
        String value;

        private TopicValue() {
        }

        public int getCount() {
            return this.count;
        }

        public String getValue() {
            return this.value;
        }
    }

    public int getFeaturedStoryCount() {
        return this.featuredStoryCount;
    }

    public Date getFirstSubmissionTime() {
        return this.firstSubmissionTime;
    }

    public int getHelpFulVoteCount() {
        return this.helpFulVoteCount;
    }

    public Date getLastSubmissionTime() {
        return this.lastSubmissionTime;
    }

    public String getName() {
        return this.name;
    }

    public int getNotHelpFulVoteCount() {
        return this.notHelpFulVoteCount;
    }

    public TagDistribution getTagDistribution() {
        return this.tagDistribution;
    }

    public List<String> getTagDistribvutionOrder() {
        return this.tagDistribvutionOrder;
    }

    public int getTotalStoryCount() {
        return this.totalStoryCount;
    }

    StoryStatistics() {
    }
}
