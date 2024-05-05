theme: /

    state: Start
        q!: $regex</start>
        a: I need to speak to the owner of the business or (spouse or manager)?.
        
        state: Employer
            q:  (i am/it's me) 
            a: This is "YOUR NAME" with office. I know you're busy and I'll be brief, we are doing free rate comparisons on our Individual Health Plans.
            go!: /survey/TakeNotes
        
        state: NotEmployer
            q: *
            a: Well maybe you can help me. Does the owner provide your health insurance or do you have to get your own?
            go!: /survey/TakeNotes
            
            
    state: survey/TakeNotes
        a: To see if we can compare, Who is your insurance with now?
        q: *
        a: How much do you pay?