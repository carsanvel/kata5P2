package kata5P2;

import java.util.List;

public class MailHistogramBuilder {

    static Histogram build(List<Mail> mailList) {
        Histogram<String> histogram = new Histogram();
        
        for (Mail mail : mailList) {
            histogram.increment(mail.getDomain());
        }
        
        return histogram;
    }

    
}
