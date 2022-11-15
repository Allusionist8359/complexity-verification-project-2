    /**
    * Informs the webmaster of an unexpected problem (Exception “ex”)
    * with the deployed application (indicated by “aRequest”).
    */
    public void logAndEmailSeriousProblemS112(Throwable ex, HttpServletRequest aRequest)
    {
    /* Define local variable. */
    TroubleTicket troubleTicket = new TroubleTicket(ex, aRequest);
    /* Log message. */
    fLogger.severe("TOP LEVEL CATCHING Throwable.");
    fLogger.severe(troubleTicket.toString());
    /* Log message again. */
    System.out.println("SERIOUS PROBLEM OCCURRED.");// changed to allow compilation
    System.out.println(troubleTicket.toString());// changed to allow compilation
    /* Update context and mail trouble ticket. */
    aRequest.getSession().getServletContext().
    setAttribute(MOST_RECENT_TROUBLE_TICKET, troubleTicket);
    }
